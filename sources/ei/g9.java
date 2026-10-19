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
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.un;
public final class g9 extends pg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final d9 f9075f;
    public im0 h;
    public final k9 f9076n;

    public g9(k9 k9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, d9 d9Var, ci.e4 e4Var) {
        this.f9076n = k9Var;
        this.d = context;
        this.e = d6Var;
        this.f9075f = d9Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45913f;
        if ((i10 != 3 || !this.f9076n.W.F) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f9076n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        k9 k9Var = this.f9076n;
        ArrayList arrayList = k9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((y8) k9Var.L.get(i10)).f44286a;
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
        k9 k9Var = this.f9076n;
        r9 r9Var = k9Var.W;
        ArrayList arrayList = k9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            y8 y8Var2 = (y8) arrayList.get(i10);
            int i15 = b1Var.f45913f;
            View view = b1Var.f45910a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                y8Var = (y8) arrayList.get(i16);
            } else {
                y8Var = null;
            }
            if (y8Var != null && ((i14 = y8Var.f44286a) == i15 || (i14 == 9 && y8Var.f10148q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                q9 q9Var = (q9) view;
                boolean z12 = y8Var2.f10145n;
                q9Var.d(z12, !z12);
                int i17 = y8Var2.f10140i;
                float f7 = 1.0f;
                if (i17 > 0) {
                    q9Var.e(i17, y8Var2.f10139g, y8Var2.f10141j);
                    q9Var.b(1.0f, false);
                } else {
                    TLRPC.User user = y8Var2.f10139g;
                    if (user != null) {
                        q9Var.setUser(user);
                        if (y8Var2.f10143l && !y8Var2.f10142k) {
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
                if (!y8Var2.f10142k && !y8Var2.f10143l) {
                    z11 = false;
                }
                q9Var.c(z11, false);
                q9Var.setDivider(z10);
                q9Var.setRedCheckbox(y8Var2.f10144m);
                q9Var.v = r9Var.F;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (y8Var2.f10146o > 0) {
                        im0 im0Var = this.h;
                        if (im0Var != null && im0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + k9Var.T;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - y8Var2.f10146o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = y8Var2.f10147p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.o0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new s4.o0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f9075f.J)));
                } else if (i15 == 4) {
                    w8 w8Var = (w8) view;
                    CharSequence charSequence = y8Var2.e;
                    CharSequence charSequence2 = y8Var2.f10138f;
                    w8Var.f10048a.setText(charSequence);
                    w8Var.f10049b.setText(charSequence2);
                } else if (i15 == 11) {
                    w8 w8Var2 = (w8) view;
                    w8Var2.f10048a.setText(y8Var2.e);
                    w8Var2.f10049b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((sx0) view).f30353b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    if (y8Var2.e == null) {
                        d9Var.setFixedSize(12);
                        d9Var.setText(null);
                        return;
                    }
                    d9Var.setFixedSize(0);
                    d9Var.setText(y8Var2.e);
                } else if (i15 == 7) {
                    int i18 = y8Var2.f10137c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.q8) view).j(y8Var2.e, r9Var.f9755x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.q8) view).j(y8Var2.e, r9Var.f9756y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.q8) view).j(y8Var2.e, r9Var.f9754w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = y8Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.q8) view).t(y8Var2.e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.q8) view).o(y8Var2.e, y8Var2.f10138f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.l4) view).setText(y8Var2.e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.y7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(r9Var.H, i19, 0);
                    ci.i1 i1Var = new ci.i1(16);
                    org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
                    x7Var.f23809c = a2;
                    x7Var.d = 20;
                    x7Var.e = i1Var;
                    ((org.telegram.ui.Cells.y7) view).d(clamp, x7Var, new ai.r0(this, 22));
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View unVar;
        org.telegram.ui.Cells.q8 q8Var;
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
            org.telegram.ui.ActionBar.d6 d6Var = this.e;
            if (i10 == 3) {
                unVar = new q9(context, d6Var);
            } else {
                if (i10 == 4) {
                    view = new w8(context, d6Var, true);
                } else if (i10 == 11) {
                    unVar = new w8(context, d6Var, false);
                } else if (i10 == 8) {
                    unVar = new org.telegram.ui.Cells.l4(context, d6Var);
                    unVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21060h5, d6Var));
                } else if (i10 == 5) {
                    sx0 sx0Var = new sx0(context, null, 1, d6Var);
                    sx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    sx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    sx0Var.f30352a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = sx0Var;
                } else if (i10 == 6) {
                    unVar = new org.telegram.ui.Cells.d9(context, d6Var);
                    unVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        q8Var = new org.telegram.ui.Cells.q8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        q8Var = new org.telegram.ui.Cells.q8(23, this.d, this.e, true, false);
                    } else if (i10 == 10) {
                        unVar = new org.telegram.ui.Cells.y7(context, d6Var);
                    } else {
                        unVar = new un(context, 2);
                    }
                    unVar = q8Var;
                }
                unVar = view;
            }
        }
        return new s4.b1(unVar);
    }
}
