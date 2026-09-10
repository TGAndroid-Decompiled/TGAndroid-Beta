package bi;

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
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.vl0;
public final class gb extends ng.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final db f2757f;
    public vl0 h;
    public final kb f2758n;

    public gb(kb kbVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, db dbVar, ra raVar) {
        this.f2758n = kbVar;
        this.d = context;
        this.e = f6Var;
        this.f2757f = dbVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if ((i10 != 3 || !this.f2758n.W.F) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f2758n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        kb kbVar = this.f2758n;
        ArrayList arrayList = kbVar.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((pa) kbVar.L.get(i10)).f14046a;
        }
        return -1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        pa paVar;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        kb kbVar = this.f2758n;
        rb rbVar = kbVar.W;
        ArrayList arrayList = kbVar.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            pa paVar2 = (pa) arrayList.get(i10);
            int i15 = c1Var.f41613f;
            View view = c1Var.f41610a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                paVar = (pa) arrayList.get(i16);
            } else {
                paVar = null;
            }
            if (paVar != null && ((i14 = paVar.f14046a) == i15 || (i14 == 9 && paVar.f3414q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                qb qbVar = (qb) view;
                boolean z12 = paVar2.f3411n;
                qbVar.d(z12, !z12);
                int i17 = paVar2.f3406i;
                float f7 = 1.0f;
                if (i17 > 0) {
                    qbVar.e(i17, paVar2.f3405g, paVar2.f3407j);
                    qbVar.b(1.0f, false);
                } else {
                    TLRPC.User user = paVar2.f3405g;
                    if (user != null) {
                        qbVar.setUser(user);
                        if (paVar2.f3409l && !paVar2.f3408k) {
                            f7 = 0.5f;
                        }
                        qbVar.b(f7, false);
                    } else {
                        TLRPC.Chat chat = paVar2.h;
                        if (chat != null) {
                            qbVar.a(rb.d1(rbVar, chat), chat);
                        }
                    }
                }
                if (!paVar2.f3408k && !paVar2.f3409l) {
                    z11 = false;
                }
                qbVar.c(z11, false);
                qbVar.setDivider(z10);
                qbVar.setRedCheckbox(paVar2.f3410m);
                qbVar.v = rbVar.F;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (paVar2.f3412o > 0) {
                        vl0 vl0Var = this.h;
                        if (vl0Var != null && vl0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + kbVar.T;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - paVar2.f3412o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = paVar2.f3413p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.p0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new s4.p0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f2757f.J)));
                } else if (i15 == 4) {
                    na naVar = (na) view;
                    CharSequence charSequence = paVar2.e;
                    CharSequence charSequence2 = paVar2.f3404f;
                    naVar.f3245a.setText(charSequence);
                    naVar.f3246b.setText(charSequence2);
                } else if (i15 == 11) {
                    na naVar2 = (na) view;
                    naVar2.f3245a.setText(paVar2.e);
                    naVar2.f3246b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((jx0) view).f24510b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                    if (paVar2.e == null) {
                        f9Var.setFixedSize(12);
                        f9Var.setText(null);
                        return;
                    }
                    f9Var.setFixedSize(0);
                    f9Var.setText(paVar2.e);
                } else if (i15 == 7) {
                    int i18 = paVar2.f3403c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.s8) view).j(paVar2.e, rbVar.f3624x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.s8) view).j(paVar2.e, rbVar.f3625y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.s8) view).j(paVar2.e, rbVar.f3623w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = paVar2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.s8) view).t(paVar2.e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.s8) view).o(paVar2.e, paVar2.f3404f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.m4) view).setText(paVar2.e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.a8.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(rbVar.H, i19, 0);
                    androidx.emoji2.text.w wVar = new androidx.emoji2.text.w(12);
                    org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7();
                    z7Var.f20792c = a2;
                    z7Var.d = 20;
                    z7Var.e = wVar;
                    ((org.telegram.ui.Cells.a8) view).d(clamp, z7Var, new ai.b(this, 9));
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View qnVar;
        org.telegram.ui.Cells.s8 s8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            qnVar = new View(context);
        } else if (i10 == 0) {
            qnVar = new View(context);
            qnVar.setTag(35);
        } else if (i10 == 1) {
            qnVar = new View(context);
            qnVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.e;
            if (i10 == 3) {
                qnVar = new qb(context, f6Var);
            } else {
                if (i10 == 4) {
                    view = new na(context, f6Var, true);
                } else if (i10 == 11) {
                    qnVar = new na(context, f6Var, false);
                } else if (i10 == 8) {
                    qnVar = new org.telegram.ui.Cells.m4(context, f6Var);
                    qnVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
                } else if (i10 == 5) {
                    jx0 jx0Var = new jx0(context, null, 1, f6Var);
                    jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    jx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    jx0Var.f24509a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = jx0Var;
                } else if (i10 == 6) {
                    qnVar = new org.telegram.ui.Cells.f9(context, f6Var);
                    qnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        s8Var = new org.telegram.ui.Cells.s8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        s8Var = new org.telegram.ui.Cells.s8(23, this.d, this.e, true, false);
                    } else if (i10 == 10) {
                        qnVar = new org.telegram.ui.Cells.a8(context, f6Var);
                    } else {
                        qnVar = new qn(context, 1);
                    }
                    qnVar = s8Var;
                }
                qnVar = view;
            }
        }
        return new s4.c1(qnVar);
    }
}
