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
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.wl0;
public final class x9 extends og.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final u9 f5777f;
    public wl0 h;
    public final ba f5778n;

    public x9(ba baVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, u9 u9Var, ai.s5 s5Var) {
        this.f5778n = baVar;
        this.d = context;
        this.e = e6Var;
        this.f5777f = u9Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42932f;
        if ((i10 != 3 || !this.f5778n.W.F) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f5778n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ba baVar = this.f5778n;
        ArrayList arrayList = baVar.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((n9) baVar.L.get(i10)).f15672a;
        }
        return -1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        n9 n9Var;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        ba baVar = this.f5778n;
        ia iaVar = baVar.W;
        ArrayList arrayList = baVar.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            n9 n9Var2 = (n9) arrayList.get(i10);
            int i15 = c1Var.f42932f;
            View view = c1Var.f42929a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                n9Var = (n9) arrayList.get(i16);
            } else {
                n9Var = null;
            }
            if (n9Var != null && ((i14 = n9Var.f15672a) == i15 || (i14 == 9 && n9Var.f5090q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                ha haVar = (ha) view;
                boolean z12 = n9Var2.f5087n;
                haVar.d(z12, !z12);
                int i17 = n9Var2.f5082i;
                float f7 = 1.0f;
                if (i17 > 0) {
                    haVar.e(i17, n9Var2.f5081g, n9Var2.f5083j);
                    haVar.b(1.0f, false);
                } else {
                    TLRPC.User user = n9Var2.f5081g;
                    if (user != null) {
                        haVar.setUser(user);
                        if (n9Var2.f5085l && !n9Var2.f5084k) {
                            f7 = 0.5f;
                        }
                        haVar.b(f7, false);
                    } else {
                        TLRPC.Chat chat = n9Var2.h;
                        if (chat != null) {
                            haVar.a(ia.d1(iaVar, chat), chat);
                        }
                    }
                }
                if (!n9Var2.f5084k && !n9Var2.f5085l) {
                    z11 = false;
                }
                haVar.c(z11, false);
                haVar.setDivider(z10);
                haVar.setRedCheckbox(n9Var2.f5086m);
                haVar.v = iaVar.F;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (n9Var2.f5088o > 0) {
                        wl0 wl0Var = this.h;
                        if (wl0Var != null && wl0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + baVar.T;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - n9Var2.f5088o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = n9Var2.f5089p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.p0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new s4.p0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f5777f.J)));
                } else if (i15 == 4) {
                    l9 l9Var = (l9) view;
                    CharSequence charSequence = n9Var2.e;
                    CharSequence charSequence2 = n9Var2.f5080f;
                    l9Var.f4977a.setText(charSequence);
                    l9Var.f4978b.setText(charSequence2);
                } else if (i15 == 11) {
                    l9 l9Var2 = (l9) view;
                    l9Var2.f4977a.setText(n9Var2.e);
                    l9Var2.f4978b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((kx0) view).f25865b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (n9Var2.e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(n9Var2.e);
                } else if (i15 == 7) {
                    int i18 = n9Var2.f5079c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.r8) view).j(n9Var2.e, iaVar.f4815x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.r8) view).j(n9Var2.e, iaVar.f4816y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.r8) view).j(n9Var2.e, iaVar.f4814w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = n9Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.r8) view).t(n9Var2.e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.r8) view).o(n9Var2.e, n9Var2.f5080f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.m4) view).setText(n9Var2.e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.z7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(iaVar.H, i19, 0);
                    ai.w1 w1Var = new ai.w1(23);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f21851c = a2;
                    y7Var.d = 20;
                    y7Var.e = w1Var;
                    ((org.telegram.ui.Cells.z7) view).d(clamp, y7Var, new ai.y1(this, 13));
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View knVar;
        org.telegram.ui.Cells.r8 r8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            knVar = new View(context);
        } else if (i10 == 0) {
            knVar = new View(context);
            knVar.setTag(35);
        } else if (i10 == 1) {
            knVar = new View(context);
            knVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.e;
            if (i10 == 3) {
                knVar = new ha(context, e6Var);
            } else {
                if (i10 == 4) {
                    view = new l9(context, e6Var, true);
                } else if (i10 == 11) {
                    knVar = new l9(context, e6Var, false);
                } else if (i10 == 8) {
                    knVar = new org.telegram.ui.Cells.m4(context, e6Var);
                    knVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19133h5, e6Var));
                } else if (i10 == 5) {
                    kx0 kx0Var = new kx0(context, null, 1, e6Var);
                    kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    kx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    kx0Var.f25864a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = kx0Var;
                } else if (i10 == 6) {
                    knVar = new org.telegram.ui.Cells.e9(context, e6Var);
                    knVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, false);
                    } else if (i10 == 10) {
                        knVar = new org.telegram.ui.Cells.z7(context, e6Var);
                    } else {
                        knVar = new kn(context, 2);
                    }
                    knVar = r8Var;
                }
                knVar = view;
            }
        }
        return new s4.c1(knVar);
    }
}
