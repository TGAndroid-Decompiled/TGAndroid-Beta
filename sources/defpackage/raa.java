package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class raa extends n39 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final taa h;

    public raa(taa taaVar, Context context) {
        this.h = taaVar;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f != 1) {
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
    public final void t(s49 s49Var, int i) {
        boolean z;
        long j;
        int L;
        if (s49Var.f == 0) {
            cba cbaVar = (cba) s49Var.a;
            if (i == 1 && this.d) {
                cbaVar.setAsNewBotForumTopic(this.e);
            } else if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i);
                taa taaVar = this.h;
                TLRPC.Dialog dialog = taaVar.x2;
                if (E != null && taaVar.P1.h(E.id) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                uaa uaaVar = cbaVar.b;
                int i2 = cbaVar.f;
                be0 be0Var = cbaVar.a;
                TextView textView = cbaVar.c;
                if (dialog != null) {
                    TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-dialog.id));
                    String str = "";
                    if (dialog.id > 0) {
                        textView.setText(E.title);
                        j = 0;
                    } else if (K0 != null) {
                        if (K0.monoforum) {
                            j = 0;
                            textView.setText(na7.q1(i2).y1(cf3.n(E.from_id), false));
                        } else {
                            j = 0;
                            textView.setText(E.title);
                        }
                    } else {
                        j = 0;
                        textView.setText("");
                    }
                    if (hc2.p0(K0)) {
                        be0Var.setAnimatedEmojiDrawable(null);
                        be0Var.setImageDrawable(null);
                        long n = cf3.n(E.from_id);
                        if (cf3.D(n)) {
                            TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(n));
                            zkb.X(textView, bkb.i5, cbaVar.h);
                            uaaVar.q(V1);
                            if (V1 != null) {
                                textView.setText(qu2.m(0, V1.first_name, V1.last_name));
                            } else {
                                textView.setText("");
                            }
                            be0Var.f(V1, uaaVar);
                            be0Var.setRoundRadius(gl.L(28.0f));
                        } else {
                            TLRPC.Chat K02 = na7.q1(i2).K0(Long.valueOf(n));
                            if (K02 != null) {
                                textView.setText(K02.title);
                            } else {
                                textView.setText("");
                            }
                            uaaVar.p(K02);
                            be0Var.f(K0, uaaVar);
                        }
                    } else if (E.icon_emoji_id != j) {
                        be0Var.setImageDrawable(null);
                        be0Var.setAnimatedEmojiDrawable(new vl(13, y6c.t0, E.icon_emoji_id));
                    } else {
                        be0Var.setAnimatedEmojiDrawable(null);
                        jm4 jm4Var = new jm4(E.icon_color);
                        o06 o06Var = new o06(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        o06Var.a(str);
                        o06Var.i = 1.8f;
                        fm2 fm2Var = new fm2(jm4Var, o06Var, 0, 0);
                        fm2Var.x = true;
                        be0Var.setImageDrawable(fm2Var);
                    }
                    if (K0 != null && K0.forum && !z) {
                        L = gl.L(16.0f);
                    } else {
                        L = gl.L(28.0f);
                    }
                    be0Var.setRoundRadius(L);
                    cbaVar.d = dialog.id;
                    cbaVar.e = E.id;
                }
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.c;
        if (i != 0 && i != 2) {
            view = new View(context);
            view.setLayoutParams(new e49(-1, a.getCurrentActionBarHeight()));
        } else {
            cba cbaVar = new cba(context, this.h.J0);
            cbaVar.setLayoutParams(new e49(-1, gl.L(100.0f)));
            view = cbaVar;
        }
        return new s49(view);
    }
}
