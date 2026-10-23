package ei;

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
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.wx0;
public final class g9 extends pg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final d9 f9083f;
    public mm0 h;
    public final k9 f9084n;

    public g9(k9 k9Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, d9 d9Var, ci.d4 d4Var) {
        this.f9084n = k9Var;
        this.d = context;
        this.e = g6Var;
        this.f9083f = d9Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if ((i10 != 3 || !this.f9084n.W.F) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f9084n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        k9 k9Var = this.f9084n;
        ArrayList arrayList = k9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((y8) k9Var.L.get(i10)).f44713a;
        }
        return -1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        y8 y8Var;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        k9 k9Var = this.f9084n;
        r9 r9Var = k9Var.W;
        ArrayList arrayList = k9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            y8 y8Var2 = (y8) arrayList.get(i10);
            int i15 = b1Var.f46346f;
            View view = b1Var.f46343a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                y8Var = (y8) arrayList.get(i16);
            } else {
                y8Var = null;
            }
            if (y8Var != null && ((i14 = y8Var.f44713a) == i15 || (i14 == 9 && y8Var.f10163q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                q9 q9Var = (q9) view;
                boolean z12 = y8Var2.f10160n;
                q9Var.d(z12, !z12);
                int i17 = y8Var2.f10155i;
                float f7 = 1.0f;
                if (i17 > 0) {
                    q9Var.e(i17, y8Var2.f10154g, y8Var2.f10156j);
                    q9Var.b(1.0f, false);
                } else {
                    TLRPC.User user = y8Var2.f10154g;
                    if (user != null) {
                        q9Var.setUser(user);
                        if (y8Var2.f10158l && !y8Var2.f10157k) {
                            f7 = 0.5f;
                        }
                        q9Var.b(f7, false);
                    } else {
                        TLRPC.Chat chat = y8Var2.h;
                        if (chat != null) {
                            q9Var.a(r9.e1(r9Var, chat), chat);
                        }
                    }
                }
                if (!y8Var2.f10157k && !y8Var2.f10158l) {
                    z11 = false;
                }
                q9Var.c(z11, false);
                q9Var.setDivider(z10);
                q9Var.setRedCheckbox(y8Var2.f10159m);
                q9Var.v = r9Var.F;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (y8Var2.f10161o > 0) {
                        mm0 mm0Var = this.h;
                        if (mm0Var != null && mm0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + k9Var.T;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - y8Var2.f10161o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = y8Var2.f10162p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.o0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new s4.o0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f9083f.K)));
                } else if (i15 == 4) {
                    w8 w8Var = (w8) view;
                    CharSequence charSequence = y8Var2.e;
                    CharSequence charSequence2 = y8Var2.f10153f;
                    w8Var.f10063a.setText(charSequence);
                    w8Var.f10064b.setText(charSequence2);
                } else if (i15 == 11) {
                    w8 w8Var2 = (w8) view;
                    w8Var2.f10063a.setText(y8Var2.e);
                    w8Var2.f10064b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((wx0) view).f32371b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (y8Var2.e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(y8Var2.e);
                } else if (i15 == 7) {
                    int i18 = y8Var2.f10152c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.r8) view).l(y8Var2.e, r9Var.f9769x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.r8) view).l(y8Var2.e, r9Var.f9770y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.r8) view).l(y8Var2.e, r9Var.f9768w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = y8Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.r8) view).v(y8Var2.e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.r8) view).q(y8Var2.e, y8Var2.f10153f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.l4) view).setText(y8Var2.e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.h3) r9Var).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.y7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(r9Var.H, i19, 0);
                    c3.m mVar = new c3.m(18);
                    org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
                    x7Var.f23955c = a2;
                    x7Var.d = 20;
                    x7Var.e = mVar;
                    ((org.telegram.ui.Cells.y7) view).d(clamp, x7Var, new ai.r0(this, 22));
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View unVar;
        org.telegram.ui.Cells.r8 r8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            unVar = new View(context);
        } else if (i10 == 0) {
            unVar = new View(context);
            unVar.setTag(35);
        } else if (i10 == 1) {
            unVar = new View(context);
            unVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.e;
            if (i10 == 3) {
                unVar = new q9(context, g6Var);
            } else {
                if (i10 == 4) {
                    view = new w8(context, g6Var, true);
                } else if (i10 == 11) {
                    unVar = new w8(context, g6Var, false);
                } else if (i10 == 8) {
                    unVar = new org.telegram.ui.Cells.l4(context, g6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, unVar, g6Var);
                } else if (i10 == 5) {
                    wx0 wx0Var = new wx0(context, null, 1, g6Var);
                    wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    wx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    wx0Var.f32370a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = wx0Var;
                } else if (i10 == 6) {
                    unVar = new org.telegram.ui.Cells.e9(context, g6Var);
                    unVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, false);
                    } else if (i10 == 10) {
                        unVar = new org.telegram.ui.Cells.y7(context, g6Var);
                    } else {
                        unVar = new un(context, 2);
                    }
                    unVar = r8Var;
                }
                unVar = view;
            }
        }
        return new s4.b1(unVar);
    }
}
