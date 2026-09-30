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
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.zl0;
public final class u9 extends og.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final r9 f5640f;
    public zl0 h;
    public final y9 f5641n;

    public u9(y9 y9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, r9 r9Var, ai.r5 r5Var) {
        this.f5641n = y9Var;
        this.d = context;
        this.e = d6Var;
        this.f5640f = r9Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43071f;
        if ((i10 != 3 || !this.f5641n.W.F) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f5641n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        y9 y9Var = this.f5641n;
        ArrayList arrayList = y9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((k9) y9Var.L.get(i10)).f15731a;
        }
        return -1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        k9 k9Var;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        y9 y9Var = this.f5641n;
        fa faVar = y9Var.W;
        ArrayList arrayList = y9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            k9 k9Var2 = (k9) arrayList.get(i10);
            int i15 = c1Var.f43071f;
            View view = c1Var.f43068a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                k9Var = (k9) arrayList.get(i16);
            } else {
                k9Var = null;
            }
            if (k9Var != null && ((i14 = k9Var.f15731a) == i15 || (i14 == 9 && k9Var.f4922q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                ea eaVar = (ea) view;
                boolean z12 = k9Var2.f4919n;
                eaVar.d(z12, !z12);
                int i17 = k9Var2.f4914i;
                float f7 = 1.0f;
                if (i17 > 0) {
                    eaVar.e(i17, k9Var2.f4913g, k9Var2.f4915j);
                    eaVar.b(1.0f, false);
                } else {
                    TLRPC.User user = k9Var2.f4913g;
                    if (user != null) {
                        eaVar.setUser(user);
                        if (k9Var2.f4917l && !k9Var2.f4916k) {
                            f7 = 0.5f;
                        }
                        eaVar.b(f7, false);
                    } else {
                        TLRPC.Chat chat = k9Var2.h;
                        if (chat != null) {
                            eaVar.a(fa.d1(faVar, chat), chat);
                        }
                    }
                }
                if (!k9Var2.f4916k && !k9Var2.f4917l) {
                    z11 = false;
                }
                eaVar.c(z11, false);
                eaVar.setDivider(z10);
                eaVar.setRedCheckbox(k9Var2.f4918m);
                eaVar.v = faVar.F;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (k9Var2.f4920o > 0) {
                        zl0 zl0Var = this.h;
                        if (zl0Var != null && zl0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + y9Var.T;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - k9Var2.f4920o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = k9Var2.f4921p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.p0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new s4.p0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f5640f.J)));
                } else if (i15 == 4) {
                    i9 i9Var = (i9) view;
                    CharSequence charSequence = k9Var2.e;
                    CharSequence charSequence2 = k9Var2.f4912f;
                    i9Var.f4798a.setText(charSequence);
                    i9Var.f4799b.setText(charSequence2);
                } else if (i15 == 11) {
                    i9 i9Var2 = (i9) view;
                    i9Var2.f4798a.setText(k9Var2.e);
                    i9Var2.f4799b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((lx0) view).f26144b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (k9Var2.e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(k9Var2.e);
                } else if (i15 == 7) {
                    int i18 = k9Var2.f4911c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.r8) view).j(k9Var2.e, faVar.f4714x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.r8) view).j(k9Var2.e, faVar.f4715y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.r8) view).j(k9Var2.e, faVar.f4713w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = k9Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.r8) view).t(k9Var2.e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.r8) view).o(k9Var2.e, k9Var2.f4912f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.m4) view).setText(k9Var2.e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.z7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(faVar.H, i19, 0);
                    ai.w1 w1Var = new ai.w1(23);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f21908c = a2;
                    y7Var.d = 20;
                    y7Var.e = w1Var;
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
            org.telegram.ui.ActionBar.d6 d6Var = this.e;
            if (i10 == 3) {
                nnVar = new ea(context, d6Var);
            } else {
                if (i10 == 4) {
                    view = new i9(context, d6Var, true);
                } else if (i10 == 11) {
                    nnVar = new i9(context, d6Var, false);
                } else if (i10 == 8) {
                    nnVar = new org.telegram.ui.Cells.m4(context, d6Var);
                    nnVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19146h5, d6Var));
                } else if (i10 == 5) {
                    lx0 lx0Var = new lx0(context, null, 1, d6Var);
                    lx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    lx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    lx0Var.f26143a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = lx0Var;
                } else if (i10 == 6) {
                    nnVar = new org.telegram.ui.Cells.e9(context, d6Var);
                    nnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, false);
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
