package kh;

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
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.wk0;
public final class j9 extends wf.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.b6 f15482e;
    public final f9 f15483f;
    public wk0 h;
    public final n9 f15484n;

    public j9(n9 n9Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, f9 f9Var, ih.y3 y3Var) {
        this.f15484n = n9Var;
        this.d = context;
        this.f15482e = b6Var;
        this.f15483f = f9Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if ((i9 != 3 || !this.f15484n.S.B) && i9 != 7 && i9 != 9 && i9 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f15484n.H;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i9) {
        n9 n9Var = this.f15484n;
        ArrayList arrayList = n9Var.H;
        if (arrayList != null && i9 >= 0 && i9 < arrayList.size()) {
            return ((a9) n9Var.H.get(i9)).f48814a;
        }
        return -1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        a9 a9Var;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        n9 n9Var = this.f15484n;
        t9 t9Var = n9Var.S;
        ArrayList arrayList = n9Var.H;
        if (arrayList != null && i9 >= 0 && i9 < arrayList.size()) {
            a9 a9Var2 = (a9) arrayList.get(i9);
            int i14 = q1Var.f5505f;
            View view = q1Var.f5501a;
            boolean z11 = true;
            int i15 = i9 + 1;
            if (i15 < arrayList.size()) {
                a9Var = (a9) arrayList.get(i15);
            } else {
                a9Var = null;
            }
            if (a9Var != null && ((i13 = a9Var.f48814a) == i14 || (i13 == 9 && a9Var.f14966q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i14 == 3) {
                s9 s9Var = (s9) view;
                boolean z12 = a9Var2.f14963n;
                s9Var.d(z12, !z12);
                int i16 = a9Var2.f14958i;
                float f10 = 1.0f;
                if (i16 > 0) {
                    s9Var.e(i16, a9Var2.f14957g, a9Var2.f14959j);
                    s9Var.b(1.0f, false);
                } else {
                    TLRPC.User user = a9Var2.f14957g;
                    if (user != null) {
                        s9Var.setUser(user);
                        if (a9Var2.f14961l && !a9Var2.f14960k) {
                            f10 = 0.5f;
                        }
                        s9Var.b(f10, false);
                    } else {
                        TLRPC.Chat chat = a9Var2.h;
                        if (chat != null) {
                            s9Var.a(t9.d1(t9Var, chat), chat);
                        }
                    }
                }
                if (!a9Var2.f14960k && !a9Var2.f14961l) {
                    z11 = false;
                }
                s9Var.c(z11, false);
                s9Var.setDivider(z10);
                s9Var.setRedCheckbox(a9Var2.f14962m);
                s9Var.v = t9Var.B;
            } else if (i14 != 2) {
                if (i14 == 0) {
                    view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
                } else if (i14 == -1) {
                    if (a9Var2.f14964o > 0) {
                        wk0 wk0Var = this.h;
                        if (wk0Var != null && wk0Var.getMeasuredHeight() > 0) {
                            i12 = this.h.getMeasuredHeight() + n9Var.P;
                        } else {
                            i12 = AndroidUtilities.displaySize.y;
                        }
                        i11 = Math.max(i12 - a9Var2.f14964o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i11 = a9Var2.f14965p;
                        if (i11 >= 0) {
                            view.setTag(null);
                        } else {
                            i11 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new f2.a1(-1, i11));
                } else if (i14 == 1) {
                    view.setLayoutParams(new f2.a1(-1, Math.min(AndroidUtilities.dp(150.0f), this.f15483f.F)));
                } else if (i14 == 4) {
                    y8 y8Var = (y8) view;
                    CharSequence charSequence = a9Var2.f14955e;
                    CharSequence charSequence2 = a9Var2.f14956f;
                    y8Var.f16402a.setText(charSequence);
                    y8Var.f16403b.setText(charSequence2);
                } else if (i14 == 11) {
                    y8 y8Var2 = (y8) view;
                    y8Var2.f16402a.setText(a9Var2.f14955e);
                    y8Var2.f16403b.setText((CharSequence) null);
                } else if (i14 == 5) {
                    try {
                        ((gw0) view).f28883b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i14 == 6) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    if (a9Var2.f14955e == null) {
                        b9Var.setFixedSize(12);
                        b9Var.setText(null);
                        return;
                    }
                    b9Var.setFixedSize(0);
                    b9Var.setText(a9Var2.f14955e);
                } else if (i14 == 7) {
                    int i17 = a9Var2.f14954c;
                    if (i17 == 0) {
                        ((org.telegram.ui.Cells.p8) view).j(a9Var2.f14955e, t9Var.f16105x, z10);
                    } else if (i17 == 1) {
                        ((org.telegram.ui.Cells.p8) view).j(a9Var2.f14955e, t9Var.f16106y, z10);
                    } else if (i17 == 2) {
                        ((org.telegram.ui.Cells.p8) view).j(a9Var2.f14955e, t9Var.f16104w, z10);
                    }
                } else if (i14 == 9) {
                    Drawable drawable = a9Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.p8) view).t(a9Var2.f14955e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.p8) view).o(a9Var2.f14955e, a9Var2.f14956f, false, z10);
                    }
                } else if (i14 == 8) {
                    ((org.telegram.ui.Cells.m4) view).setText(a9Var2.f14955e);
                } else if (i14 == 10) {
                    i10 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                    int i18 = (int) MessagesController.getInstance(i10).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.x7.a(i18, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(t9Var.D, i18, 0);
                    i3.i iVar = new i3.i(16);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.f25909c = a2;
                    w7Var.d = 20;
                    w7Var.f25910e = iVar;
                    ((org.telegram.ui.Cells.x7) view).d(clamp, w7Var, new i9(this, 0));
                }
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View anVar;
        org.telegram.ui.Cells.p8 p8Var;
        View view;
        Context context = this.d;
        if (i9 == -1) {
            anVar = new View(context);
        } else if (i9 == 0) {
            anVar = new View(context);
            anVar.setTag(35);
        } else if (i9 == 1) {
            anVar = new View(context);
            anVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.b6 b6Var = this.f15482e;
            if (i9 == 3) {
                anVar = new s9(context, b6Var);
            } else {
                if (i9 == 4) {
                    view = new y8(context, b6Var, true);
                } else if (i9 == 11) {
                    anVar = new y8(context, b6Var, false);
                } else if (i9 == 8) {
                    anVar = new org.telegram.ui.Cells.m4(context, b6Var);
                    anVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
                } else if (i9 == 5) {
                    gw0 gw0Var = new gw0(context, null, 1, b6Var);
                    gw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    gw0Var.f28885e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    gw0Var.f28882a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = gw0Var;
                } else if (i9 == 6) {
                    anVar = new org.telegram.ui.Cells.b9(context, b6Var);
                    anVar.setBackgroundColor(-15921907);
                } else {
                    if (i9 == 7) {
                        p8Var = new org.telegram.ui.Cells.p8(23, this.d, this.f15482e, true, true);
                    } else if (i9 == 9) {
                        p8Var = new org.telegram.ui.Cells.p8(23, this.d, this.f15482e, true, false);
                    } else if (i9 == 10) {
                        anVar = new org.telegram.ui.Cells.x7(context, b6Var);
                    } else {
                        anVar = new an(context, 3);
                    }
                    anVar = p8Var;
                }
                anVar = view;
            }
        }
        return new f2.q1(anVar);
    }
}
