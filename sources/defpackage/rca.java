package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class rca extends q59 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final tca h;

    public rca(tca tcaVar, Context context) {
        this.h = tcaVar;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i) {
        int i2 = i - 1;
        if (this.d) {
            i2 = i - 2;
        }
        ArrayList arrayList = this.f;
        if (arrayList != null && i2 >= 0 && i2 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f.get(i2);
        }
        return null;
    }

    @Override
    public final int b() {
        int i;
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            i = arrayList.size() + 1;
        } else {
            i = 0;
        }
        return i + (this.d ? 1 : 0);
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        long j;
        int L;
        if (u69Var.f == 0) {
            cda cdaVar = (cda) u69Var.a;
            if (i == 1 && this.d) {
                cdaVar.setAsNewBotForumTopic(this.e);
            } else if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i);
                tca tcaVar = this.h;
                TLRPC.Dialog dialog = tcaVar.x2;
                if (E != null && tcaVar.P1.h(E.id) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                uca ucaVar = cdaVar.b;
                int i2 = cdaVar.f;
                bf0 bf0Var = cdaVar.a;
                TextView textView = cdaVar.c;
                if (dialog != null) {
                    TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-dialog.id));
                    String str = "";
                    if (dialog.id > 0) {
                        textView.setText(E.title);
                        j = 0;
                    } else if (L0 != null) {
                        if (L0.monoforum) {
                            j = 0;
                            textView.setText(oc7.r1(i2).z1(pg3.n(E.from_id), false));
                        } else {
                            j = 0;
                            textView.setText(E.title);
                        }
                    } else {
                        j = 0;
                        textView.setText("");
                    }
                    if (sd2.p0(L0)) {
                        bf0Var.setAnimatedEmojiDrawable(null);
                        bf0Var.setImageDrawable(null);
                        long n = pg3.n(E.from_id);
                        if (pg3.D(n)) {
                            TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(n));
                            anb.X(textView, cmb.i5, cdaVar.h);
                            ucaVar.q(W1);
                            if (W1 != null) {
                                textView.setText(bw2.m(0, W1.first_name, W1.last_name));
                            } else {
                                textView.setText("");
                            }
                            bf0Var.f(W1, ucaVar);
                            bf0Var.setRoundRadius(gm.L(28.0f));
                        } else {
                            TLRPC.Chat L02 = oc7.r1(i2).L0(Long.valueOf(n));
                            if (L02 != null) {
                                textView.setText(L02.title);
                            } else {
                                textView.setText("");
                            }
                            ucaVar.p(L02);
                            bf0Var.f(L0, ucaVar);
                        }
                    } else if (E.icon_emoji_id != j) {
                        bf0Var.setImageDrawable(null);
                        bf0Var.setAnimatedEmojiDrawable(new vm(13, z8c.t0, E.icon_emoji_id));
                    } else {
                        bf0Var.setAnimatedEmojiDrawable(null);
                        ko4 ko4Var = new ko4(E.icon_color);
                        o26 o26Var = new o26(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        o26Var.a(str);
                        o26Var.i = 1.8f;
                        sn2 sn2Var = new sn2(ko4Var, o26Var, 0, 0);
                        sn2Var.x = true;
                        bf0Var.setImageDrawable(sn2Var);
                    }
                    if (L0 != null && L0.forum && !z) {
                        L = gm.L(16.0f);
                    } else {
                        L = gm.L(28.0f);
                    }
                    bf0Var.setRoundRadius(L);
                    cdaVar.d = dialog.id;
                    cdaVar.e = E.id;
                }
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.c;
        if (i != 0 && i != 2) {
            view = new View(context);
            view.setLayoutParams(new g69(-1, a.getCurrentActionBarHeight()));
        } else {
            cda cdaVar = new cda(context, this.h.J0);
            cdaVar.setLayoutParams(new g69(-1, gm.L(100.0f)));
            view = cdaVar;
        }
        return new u69(view);
    }
}
