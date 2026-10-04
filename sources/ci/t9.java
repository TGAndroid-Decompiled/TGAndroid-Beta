package ci;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.zl0;
public final class t9 extends og.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 f6011e;
    public final q9 f6012f;
    public zl0 h;
    public final x9 f6013n;

    public t9(x9 x9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, q9 q9Var, ai.r5 r5Var) {
        this.f6013n = x9Var;
        this.d = context;
        this.f6011e = d6Var;
        this.f6012f = q9Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46528f;
        if ((i10 != 3 || !this.f6013n.W.F) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f6013n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        x9 x9Var = this.f6013n;
        ArrayList arrayList = x9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((j9) x9Var.L.get(i10)).f17183a;
        }
        return -1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        j9 j9Var;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        x9 x9Var = this.f6013n;
        ea eaVar = x9Var.W;
        ArrayList arrayList = x9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            j9 j9Var2 = (j9) arrayList.get(i10);
            int i15 = c1Var.f46528f;
            View view = c1Var.f46524a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                j9Var = (j9) arrayList.get(i16);
            } else {
                j9Var = null;
            }
            if (j9Var != null && ((i14 = j9Var.f17183a) == i15 || (i14 == 9 && j9Var.f5265q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                da daVar = (da) view;
                boolean z12 = j9Var2.f5262n;
                daVar.d(z12, !z12);
                int i17 = j9Var2.f5257i;
                float f7 = 1.0f;
                if (i17 > 0) {
                    daVar.e(i17, j9Var2.f5256g, j9Var2.f5258j);
                    daVar.b(1.0f, false);
                } else {
                    TLRPC.User user = j9Var2.f5256g;
                    if (user != null) {
                        daVar.setUser(user);
                        if (j9Var2.f5260l && !j9Var2.f5259k) {
                            f7 = 0.5f;
                        }
                        daVar.b(f7, false);
                    } else {
                        TLRPC.Chat chat = j9Var2.h;
                        if (chat != null) {
                            daVar.a(ea.d1(eaVar, chat), chat);
                        }
                    }
                }
                if (!j9Var2.f5259k && !j9Var2.f5260l) {
                    z11 = false;
                }
                daVar.c(z11, false);
                daVar.setDivider(z10);
                daVar.setRedCheckbox(j9Var2.f5261m);
                daVar.v = eaVar.F;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (j9Var2.f5263o > 0) {
                        zl0 zl0Var = this.h;
                        if (zl0Var != null && zl0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + x9Var.T;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - j9Var2.f5263o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = j9Var2.f5264p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.p0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new s4.p0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f6012f.J)));
                } else if (i15 == 4) {
                    h9 h9Var = (h9) view;
                    CharSequence charSequence = j9Var2.f5254e;
                    CharSequence charSequence2 = j9Var2.f5255f;
                    h9Var.f5137a.setText(charSequence);
                    h9Var.f5138b.setText(charSequence2);
                } else if (i15 == 11) {
                    h9 h9Var2 = (h9) view;
                    h9Var2.f5137a.setText(j9Var2.f5254e);
                    h9Var2.f5138b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((tx0) view).f31193b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (j9Var2.f5254e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(j9Var2.f5254e);
                } else if (i15 == 7) {
                    int i18 = j9Var2.f5253c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.r8) view).j(j9Var2.f5254e, eaVar.f5057x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.r8) view).j(j9Var2.f5254e, eaVar.f5058y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.r8) view).j(j9Var2.f5254e, eaVar.f5056w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = j9Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.r8) view).t(j9Var2.f5254e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.r8) view).o(j9Var2.f5254e, j9Var2.f5255f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.m4) view).setText(j9Var2.f5254e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.z7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(eaVar.H, i19, 0);
                    ai.w1 w1Var = new ai.w1(23);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f23773c = a2;
                    y7Var.d = 20;
                    y7Var.f23774e = w1Var;
                    ((org.telegram.ui.Cells.z7) view).d(clamp, y7Var, new ai.y1(this, 16));
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View nnVar;
        org.telegram.ui.Cells.r8 r8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            nnVar = new View(context);
        } else if (i10 == 0) {
            nnVar = new View(context);
            nnVar.setTag(35);
        } else if (i10 == 1) {
            nnVar = new View(context);
            nnVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = this.f6011e;
            if (i10 == 3) {
                nnVar = new da(context, d6Var);
            } else {
                if (i10 == 4) {
                    view = new h9(context, d6Var, true);
                } else if (i10 == 11) {
                    nnVar = new h9(context, d6Var, false);
                } else if (i10 == 8) {
                    nnVar = new org.telegram.ui.Cells.m4(context, d6Var);
                    nnVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20890h5, d6Var));
                } else if (i10 == 5) {
                    tx0 tx0Var = new tx0(context, null, 1, d6Var);
                    tx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    tx0Var.f31195e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    tx0Var.f31192a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = tx0Var;
                } else if (i10 == 6) {
                    nnVar = new org.telegram.ui.Cells.e9(context, d6Var);
                    nnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.f6011e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.f6011e, true, false);
                    } else if (i10 == 10) {
                        nnVar = new org.telegram.ui.Cells.z7(context, d6Var);
                    } else {
                        nnVar = new nn(context, 2);
                    }
                    nnVar = r8Var;
                }
                nnVar = view;
            }
        }
        return new s4.c1(nnVar);
    }
}
