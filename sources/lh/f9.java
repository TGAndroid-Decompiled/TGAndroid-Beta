package lh;

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
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zm;

public final class f9 extends xf.b {
    public final Context d;

    public final org.telegram.ui.ActionBar.c6 f16008e;

    public final c9 f16009f;
    public zk0 h;

    public final k9 f16010n;

    public f9(k9 k9Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, c9 c9Var, jh.u3 u3Var) {
        this.f16010n = k9Var;
        this.d = context;
        this.f16008e = c6Var;
        this.f16009f = c9Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return (i10 == 3 && this.f16010n.S.B) || i10 == 7 || i10 == 9 || i10 == 10;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f16010n.H;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        k9 k9Var = this.f16010n;
        ArrayList arrayList = k9Var.H;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((x8) k9Var.H.get(i10)).f49413a;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int iMax;
        int i11;
        k9 k9Var = this.f16010n;
        q9 q9Var = k9Var.S;
        ArrayList arrayList = k9Var.H;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        x8 x8Var = (x8) arrayList.get(i10);
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        boolean z10 = true;
        int i13 = i10 + 1;
        x8 x8Var2 = i13 < arrayList.size() ? (x8) arrayList.get(i13) : null;
        boolean z11 = x8Var2 != null && ((i11 = x8Var2.f49413a) == i12 || (i11 == 9 && x8Var2.f17050q == 1));
        if (i12 == 3) {
            p9 p9Var = (p9) view;
            boolean z12 = x8Var.f17047n;
            p9Var.d(z12, !z12);
            int i14 = x8Var.f17042i;
            float f10 = 1.0f;
            if (i14 > 0) {
                p9Var.e(i14, x8Var.f17041g, x8Var.f17043j);
                p9Var.b(1.0f, false);
            } else {
                TLRPC.User user = x8Var.f17041g;
                if (user != null) {
                    p9Var.setUser(user);
                    if (x8Var.f17045l && !x8Var.f17044k) {
                        f10 = 0.5f;
                    }
                    p9Var.b(f10, false);
                } else {
                    TLRPC.Chat chat = x8Var.h;
                    if (chat != null) {
                        p9Var.a(q9.d1(q9Var, chat), chat);
                    }
                }
            }
            if (!x8Var.f17044k && !x8Var.f17045l) {
                z10 = false;
            }
            p9Var.c(z10, false);
            p9Var.setDivider(z11);
            p9Var.setRedCheckbox(x8Var.f17046m);
            p9Var.v = q9Var.B;
            return;
        }
        if (i12 == 2) {
            return;
        }
        if (i12 == 0) {
            view.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            return;
        }
        if (i12 == -1) {
            if (x8Var.f17048o > 0) {
                zk0 zk0Var = this.h;
                iMax = Math.max(((zk0Var == null || zk0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + k9Var.P) - x8Var.f17048o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                iMax = x8Var.f17049p;
                if (iMax >= 0) {
                    view.setTag(null);
                } else {
                    iMax = (int) (AndroidUtilities.displaySize.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new f2.y0(-1, iMax));
            return;
        }
        if (i12 == 1) {
            view.setLayoutParams(new f2.y0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f16009f.F)));
            return;
        }
        if (i12 == 4) {
            v8 v8Var = (v8) view;
            CharSequence charSequence = x8Var.f17039e;
            CharSequence charSequence2 = x8Var.f17040f;
            v8Var.f16944a.setText(charSequence);
            v8Var.f16945b.setText(charSequence2);
            return;
        }
        if (i12 == 11) {
            v8 v8Var2 = (v8) view;
            v8Var2.f16944a.setText(x8Var.f17039e);
            v8Var2.f16945b.setText((CharSequence) null);
            return;
        }
        if (i12 == 5) {
            try {
                ((iw0) view).f29504b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.x8 x8Var3 = (org.telegram.ui.Cells.x8) view;
            if (x8Var.f17039e == null) {
                x8Var3.setFixedSize(12);
                x8Var3.setText(null);
                return;
            } else {
                x8Var3.setFixedSize(0);
                x8Var3.setText(x8Var.f17039e);
                return;
            }
        }
        if (i12 == 7) {
            int i15 = x8Var.f17038c;
            if (i15 == 0) {
                ((org.telegram.ui.Cells.l8) view).j(x8Var.f17039e, q9Var.f16601x, z11);
                return;
            } else if (i15 == 1) {
                ((org.telegram.ui.Cells.l8) view).j(x8Var.f17039e, q9Var.f16602y, z11);
                return;
            } else {
                if (i15 == 2) {
                    ((org.telegram.ui.Cells.l8) view).j(x8Var.f17039e, q9Var.f16600w, z11);
                    return;
                }
                return;
            }
        }
        if (i12 == 9) {
            Drawable drawable = x8Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.l8) view).t(x8Var.f17039e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.l8) view).o(x8Var.f17039e, x8Var.f17040f, false, z11);
                return;
            }
        }
        if (i12 == 8) {
            ((org.telegram.ui.Cells.j4) view).setText(x8Var.f17039e);
            return;
        }
        if (i12 == 10) {
            int i16 = (int) MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).starsPaidMessageAmountMax;
            int[] iArrA = org.telegram.ui.Cells.u7.a(i16, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
            int iClamp = Utilities.clamp(q9Var.D, i16, 0);
            ia.l lVar = new ia.l(23);
            org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
            t7Var.f25681c = iArrA;
            t7Var.d = 20;
            t7Var.f25682e = lVar;
            ((org.telegram.ui.Cells.u7) view).d(iClamp, t7Var, new n6(this, 2));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l8 l8Var;
        View u7Var;
        View v8Var;
        Context context = this.d;
        if (i10 == -1) {
            u7Var = new j9(context);
        } else if (i10 == 0) {
            View view = new View(context);
            view.setTag(35);
            u7Var = view;
        } else if (i10 == 1) {
            View view2 = new View(context);
            view2.setTag(34);
            u7Var = view2;
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = this.f16008e;
            if (i10 == 3) {
                u7Var = new p9(context, c6Var);
            } else {
                if (i10 == 4) {
                    v8Var = new v8(context, c6Var, true);
                } else if (i10 == 11) {
                    u7Var = new v8(context, c6Var, false);
                } else if (i10 == 8) {
                    org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, c6Var);
                    j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
                    u7Var = j4Var;
                } else if (i10 == 5) {
                    iw0 iw0Var = new iw0(context, null, 1, c6Var);
                    iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    iw0Var.f29506e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    iw0Var.f29503a.setTranslationY(AndroidUtilities.dp(24.0f));
                    v8Var = iw0Var;
                } else if (i10 == 6) {
                    org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, c6Var);
                    x8Var.setBackgroundColor(-15921907);
                    u7Var = x8Var;
                } else {
                    if (i10 == 7) {
                        l8Var = new org.telegram.ui.Cells.l8(23, this.d, this.f16008e, true, true);
                    } else if (i10 == 9) {
                        l8Var = new org.telegram.ui.Cells.l8(23, this.d, this.f16008e, true, false);
                    } else {
                        u7Var = i10 == 10 ? new org.telegram.ui.Cells.u7(context, c6Var) : new zm(context, 5);
                    }
                    u7Var = l8Var;
                }
                u7Var = v8Var;
            }
        }
        return new lk0(u7Var);
    }
}
