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
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.rm0;
public final class u9 extends og.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 f6092e;
    public final r9 f6093f;
    public rm0 h;
    public final y9 f6094n;

    public u9(y9 y9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, r9 r9Var, ai.s5 s5Var) {
        this.f6094n = y9Var;
        this.d = context;
        this.f6092e = d6Var;
        this.f6093f = r9Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47786f;
        if ((i10 != 3 || !this.f6094n.W.F) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f6094n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        y9 y9Var = this.f6094n;
        ArrayList arrayList = y9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((k9) y9Var.L.get(i10)).f17211a;
        }
        return -1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        k9 k9Var;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        y9 y9Var = this.f6094n;
        fa faVar = y9Var.W;
        ArrayList arrayList = y9Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            k9 k9Var2 = (k9) arrayList.get(i10);
            int i15 = d1Var.f47786f;
            View view = d1Var.f47782a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                k9Var = (k9) arrayList.get(i16);
            } else {
                k9Var = null;
            }
            if (k9Var != null && ((i14 = k9Var.f17211a) == i15 || (i14 == 9 && k9Var.f5336q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                ea eaVar = (ea) view;
                boolean z12 = k9Var2.f5333n;
                eaVar.d(z12, !z12);
                int i17 = k9Var2.f5328i;
                float f7 = 1.0f;
                if (i17 > 0) {
                    eaVar.e(i17, k9Var2.f5327g, k9Var2.f5329j);
                    eaVar.b(1.0f, false);
                } else {
                    TLRPC.User user = k9Var2.f5327g;
                    if (user != null) {
                        eaVar.setUser(user);
                        if (k9Var2.f5331l && !k9Var2.f5330k) {
                            f7 = 0.5f;
                        }
                        eaVar.b(f7, false);
                    } else {
                        TLRPC.Chat chat = k9Var2.h;
                        if (chat != null) {
                            eaVar.a(fa.e1(faVar, chat), chat);
                        }
                    }
                }
                if (!k9Var2.f5330k && !k9Var2.f5331l) {
                    z11 = false;
                }
                eaVar.c(z11, false);
                eaVar.setDivider(z10);
                eaVar.setRedCheckbox(k9Var2.f5332m);
                eaVar.v = faVar.F;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (k9Var2.f5334o > 0) {
                        rm0 rm0Var = this.h;
                        if (rm0Var != null && rm0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + y9Var.T;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - k9Var2.f5334o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = k9Var2.f5335p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.q0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new s4.q0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f6093f.J)));
                } else if (i15 == 4) {
                    i9 i9Var = (i9) view;
                    CharSequence charSequence = k9Var2.f5325e;
                    CharSequence charSequence2 = k9Var2.f5326f;
                    i9Var.f5206a.setText(charSequence);
                    i9Var.f5207b.setText(charSequence2);
                } else if (i15 == 11) {
                    i9 i9Var2 = (i9) view;
                    i9Var2.f5206a.setText(k9Var2.f5325e);
                    i9Var2.f5207b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((by0) view).f25121b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (k9Var2.f5325e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(k9Var2.f5325e);
                } else if (i15 == 7) {
                    int i18 = k9Var2.f5324c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.r8) view).j(k9Var2.f5325e, faVar.f5103x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.r8) view).j(k9Var2.f5325e, faVar.f5104y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.r8) view).j(k9Var2.f5325e, faVar.f5102w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = k9Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.r8) view).t(k9Var2.f5325e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.r8) view).o(k9Var2.f5325e, k9Var2.f5326f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.m4) view).setText(k9Var2.f5325e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.z7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(faVar.H, i19, 0);
                    ai.w1 w1Var = new ai.w1(23);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f23809c = a2;
                    y7Var.d = 20;
                    y7Var.f23810e = w1Var;
                    ((org.telegram.ui.Cells.z7) view).d(clamp, y7Var, new ai.y1(this, 16));
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View aoVar;
        org.telegram.ui.Cells.r8 r8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            aoVar = new View(context);
        } else if (i10 == 0) {
            aoVar = new View(context);
            aoVar.setTag(35);
        } else if (i10 == 1) {
            aoVar = new View(context);
            aoVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = this.f6092e;
            if (i10 == 3) {
                aoVar = new ea(context, d6Var);
            } else {
                if (i10 == 4) {
                    view = new i9(context, d6Var, true);
                } else if (i10 == 11) {
                    aoVar = new i9(context, d6Var, false);
                } else if (i10 == 8) {
                    aoVar = new org.telegram.ui.Cells.m4(context, d6Var);
                    aoVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20893h5, d6Var));
                } else if (i10 == 5) {
                    by0 by0Var = new by0(context, null, 1, d6Var);
                    by0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    by0Var.f25123e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    by0Var.f25120a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = by0Var;
                } else if (i10 == 6) {
                    aoVar = new org.telegram.ui.Cells.e9(context, d6Var);
                    aoVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.f6092e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.f6092e, true, false);
                    } else if (i10 == 10) {
                        aoVar = new org.telegram.ui.Cells.z7(context, d6Var);
                    } else {
                        aoVar = new ao(context, 2);
                    }
                    aoVar = r8Var;
                }
                aoVar = view;
            }
        }
        return new s4.d1(aoVar);
    }
}
