package fi;

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
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vn;
public final class c9 extends qg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final z8 f10616f;
    public mm0 h;
    public final g9 f10617n;

    public c9(g9 g9Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, z8 z8Var, di.e4 e4Var) {
        this.f10617n = g9Var;
        this.d = context;
        this.e = u6Var;
        this.f10616f = z8Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
        if ((i10 != 3 || !this.f10617n.W.F) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f10617n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        g9 g9Var = this.f10617n;
        ArrayList arrayList = g9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((u8) g9Var.L.get(i10)).f47037a;
        }
        return -1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        u8 u8Var;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        g9 g9Var = this.f10617n;
        n9 n9Var = g9Var.W;
        ArrayList arrayList = g9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            u8 u8Var2 = (u8) arrayList.get(i10);
            int i15 = e1Var.f47738f;
            View view = e1Var.f47735a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                u8Var = (u8) arrayList.get(i16);
            } else {
                u8Var = null;
            }
            if (u8Var != null && ((i14 = u8Var.f47037a) == i15 || (i14 == 9 && u8Var.f11763q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                m9 m9Var = (m9) view;
                boolean z12 = u8Var2.f11760n;
                m9Var.d(z12, !z12);
                int i17 = u8Var2.f11755i;
                float f7 = 1.0f;
                if (i17 > 0) {
                    m9Var.e(i17, u8Var2.f11754g, u8Var2.f11756j);
                    m9Var.b(1.0f, false);
                } else {
                    TLRPC.User user = u8Var2.f11754g;
                    if (user != null) {
                        m9Var.setUser(user);
                        if (u8Var2.f11758l && !u8Var2.f11757k) {
                            f7 = 0.5f;
                        }
                        m9Var.b(f7, false);
                    } else {
                        TLRPC.Chat chat = u8Var2.h;
                        if (chat != null) {
                            m9Var.a(n9.e1(n9Var, chat), chat);
                        }
                    }
                }
                if (!u8Var2.f11757k && !u8Var2.f11758l) {
                    z11 = false;
                }
                m9Var.c(z11, false);
                m9Var.setDivider(z10);
                m9Var.setRedCheckbox(u8Var2.f11759m);
                m9Var.v = n9Var.F;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (u8Var2.f11761o > 0) {
                        mm0 mm0Var = this.h;
                        if (mm0Var != null && mm0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + g9Var.T;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - u8Var2.f11761o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = u8Var2.f11762p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.q0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new s4.q0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f10616f.K)));
                } else if (i15 == 4) {
                    s8 s8Var = (s8) view;
                    CharSequence charSequence = u8Var2.e;
                    CharSequence charSequence2 = u8Var2.f11753f;
                    s8Var.f11595a.setText(charSequence);
                    s8Var.f11596b.setText(charSequence2);
                } else if (i15 == 11) {
                    s8 s8Var2 = (s8) view;
                    s8Var2.f11595a.setText(u8Var2.e);
                    s8Var2.f11596b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((ey0) view).f28013b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                    if (u8Var2.e == null) {
                        i9Var.setFixedSize(12);
                        i9Var.setText(null);
                        return;
                    }
                    i9Var.setFixedSize(0);
                    i9Var.setText(u8Var2.e);
                } else if (i15 == 7) {
                    int i18 = u8Var2.f11752c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.v8) view).l(u8Var2.e, n9Var.f11320x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.v8) view).l(u8Var2.e, n9Var.f11321y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.v8) view).l(u8Var2.e, n9Var.f11319w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = u8Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.v8) view).v(u8Var2.e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.v8) view).q(u8Var2.e, u8Var2.f11753f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.q4) view).setText(u8Var2.e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.c8.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(n9Var.H, i19, 0);
                    c2.i iVar = new c2.i(20);
                    org.telegram.ui.Cells.b8 b8Var = new org.telegram.ui.Cells.b8();
                    b8Var.f23906c = a2;
                    b8Var.d = 20;
                    b8Var.e = iVar;
                    ((org.telegram.ui.Cells.c8) view).d(clamp, b8Var, new ai.i(this, 26));
                }
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View vnVar;
        org.telegram.ui.Cells.v8 v8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            vnVar = new View(context);
        } else if (i10 == 0) {
            vnVar = new View(context);
            vnVar.setTag(35);
        } else if (i10 == 1) {
            vnVar = new View(context);
            vnVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.u6 u6Var = this.e;
            if (i10 == 3) {
                vnVar = new m9(context, u6Var);
            } else {
                if (i10 == 4) {
                    view = new s8(context, u6Var, true);
                } else if (i10 == 11) {
                    vnVar = new s8(context, u6Var, false);
                } else if (i10 == 8) {
                    vnVar = new org.telegram.ui.Cells.q4(context, u6Var);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, vnVar, u6Var);
                } else if (i10 == 5) {
                    ey0 ey0Var = new ey0(context, null, 1, u6Var);
                    ey0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    ey0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    ey0Var.f28012a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = ey0Var;
                } else if (i10 == 6) {
                    vnVar = new org.telegram.ui.Cells.i9(context, u6Var);
                    vnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        v8Var = new org.telegram.ui.Cells.v8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        v8Var = new org.telegram.ui.Cells.v8(23, this.d, this.e, true, false);
                    } else if (i10 == 10) {
                        vnVar = new org.telegram.ui.Cells.c8(context, u6Var);
                    } else {
                        vnVar = new vn(context, 2);
                    }
                    vnVar = v8Var;
                }
                vnVar = view;
            }
        }
        return new s4.e1(vnVar);
    }
}
