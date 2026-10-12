package di;

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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xn;
public final class t9 extends pg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final q9 f7852f;
    public mm0 h;
    public final x9 f7853n;

    public t9(x9 x9Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, q9 q9Var, bi.d5 d5Var) {
        this.f7853n = x9Var;
        this.d = context;
        this.e = c6Var;
        this.f7852f = q9Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if ((i10 != 3 || !this.f7853n.W.F) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f7853n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        x9 x9Var = this.f7853n;
        ArrayList arrayList = x9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((j9) x9Var.L.get(i10)).f43203a;
        }
        return -1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        j9 j9Var;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        x9 x9Var = this.f7853n;
        ea eaVar = x9Var.W;
        ArrayList arrayList = x9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            j9 j9Var2 = (j9) arrayList.get(i10);
            int i15 = b1Var.f44841f;
            View view = b1Var.f44838a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                j9Var = (j9) arrayList.get(i16);
            } else {
                j9Var = null;
            }
            if (j9Var != null && ((i14 = j9Var.f43203a) == i15 || (i14 == 9 && j9Var.f7134q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                da daVar = (da) view;
                boolean z12 = j9Var2.f7131n;
                daVar.d(z12, !z12);
                int i17 = j9Var2.f7126i;
                float f7 = 1.0f;
                if (i17 > 0) {
                    daVar.e(i17, j9Var2.f7125g, j9Var2.f7127j);
                    daVar.b(1.0f, false);
                } else {
                    TLRPC.User user = j9Var2.f7125g;
                    if (user != null) {
                        daVar.setUser(user);
                        if (j9Var2.f7129l && !j9Var2.f7128k) {
                            f7 = 0.5f;
                        }
                        daVar.b(f7, false);
                    } else {
                        TLRPC.Chat chat = j9Var2.h;
                        if (chat != null) {
                            daVar.a(ea.e1(eaVar, chat), chat);
                        }
                    }
                }
                if (!j9Var2.f7128k && !j9Var2.f7129l) {
                    z11 = false;
                }
                daVar.c(z11, false);
                daVar.setDivider(z10);
                daVar.setRedCheckbox(j9Var2.f7130m);
                daVar.v = eaVar.F;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (j9Var2.f7132o > 0) {
                        mm0 mm0Var = this.h;
                        if (mm0Var != null && mm0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + x9Var.T;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - j9Var2.f7132o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = j9Var2.f7133p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.o0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new s4.o0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f7852f.J)));
                } else if (i15 == 4) {
                    h9 h9Var = (h9) view;
                    CharSequence charSequence = j9Var2.e;
                    CharSequence charSequence2 = j9Var2.f7124f;
                    h9Var.f7008a.setText(charSequence);
                    h9Var.f7009b.setText(charSequence2);
                } else if (i15 == 11) {
                    h9 h9Var2 = (h9) view;
                    h9Var2.f7008a.setText(j9Var2.e);
                    h9Var2.f7009b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((wx0) view).f30996b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (j9Var2.e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(j9Var2.e);
                } else if (i15 == 7) {
                    int i18 = j9Var2.f7123c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.r8) view).j(j9Var2.e, eaVar.f6923x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.r8) view).j(j9Var2.e, eaVar.f6924y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.r8) view).j(j9Var2.e, eaVar.f6922w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = j9Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.r8) view).t(j9Var2.e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.r8) view).o(j9Var2.e, j9Var2.f7124f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.m4) view).setText(j9Var2.e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.z7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(eaVar.H, i19, 0);
                    bi.w2 w2Var = new bi.w2(14);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f22787c = a2;
                    y7Var.d = 20;
                    y7Var.e = w2Var;
                    ((org.telegram.ui.Cells.z7) view).d(clamp, y7Var, new bi.o1(this, 16));
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View xnVar;
        org.telegram.ui.Cells.r8 r8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            xnVar = new View(context);
        } else if (i10 == 0) {
            xnVar = new View(context);
            xnVar.setTag(35);
        } else if (i10 == 1) {
            xnVar = new View(context);
            xnVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = this.e;
            if (i10 == 3) {
                xnVar = new da(context, c6Var);
            } else {
                if (i10 == 4) {
                    view = new h9(context, c6Var, true);
                } else if (i10 == 11) {
                    xnVar = new h9(context, c6Var, false);
                } else if (i10 == 8) {
                    xnVar = new org.telegram.ui.Cells.m4(context, c6Var);
                    xnVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var));
                } else if (i10 == 5) {
                    wx0 wx0Var = new wx0(context, null, 1, c6Var);
                    wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    wx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    wx0Var.f30995a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = wx0Var;
                } else if (i10 == 6) {
                    xnVar = new org.telegram.ui.Cells.e9(context, c6Var);
                    xnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, false);
                    } else if (i10 == 10) {
                        xnVar = new org.telegram.ui.Cells.z7(context, c6Var);
                    } else {
                        xnVar = new xn(context, 2);
                    }
                    xnVar = r8Var;
                }
                xnVar = view;
            }
        }
        return new s4.b1(xnVar);
    }
}
