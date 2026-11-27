package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class iea extends c79 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final kea h;

    public iea(kea keaVar, Context context) {
        this.h = keaVar;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f != 1) {
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
    public final void t(f89 f89Var, int i) {
        boolean z;
        long j;
        int L;
        if (f89Var.f == 0) {
            tea teaVar = (tea) f89Var.a;
            if (i == 1 && this.d) {
                teaVar.setAsNewBotForumTopic(this.e);
            } else if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i);
                kea keaVar = this.h;
                TLRPC.Dialog dialog = keaVar.x2;
                if (E != null && keaVar.P1.h(E.id) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                lea leaVar = teaVar.b;
                int i2 = teaVar.f;
                de0 de0Var = teaVar.a;
                TextView textView = teaVar.c;
                if (dialog != null) {
                    TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-dialog.id));
                    String str = "";
                    if (dialog.id > 0) {
                        textView.setText(E.title);
                        j = 0;
                    } else if (M0 != null) {
                        if (M0.monoforum) {
                            j = 0;
                            textView.setText(uc7.s1(i2).A1(wf3.n(E.from_id), false));
                        } else {
                            j = 0;
                            textView.setText(E.title);
                        }
                    } else {
                        j = 0;
                        textView.setText("");
                    }
                    if (xc2.p0(M0)) {
                        de0Var.setAnimatedEmojiDrawable(null);
                        de0Var.setImageDrawable(null);
                        long n = wf3.n(E.from_id);
                        if (wf3.D(n)) {
                            TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n));
                            yob.X(textView, aob.j5, teaVar.h);
                            leaVar.q(X1);
                            if (X1 != null) {
                                textView.setText(lv2.m(0, X1.first_name, X1.last_name));
                            } else {
                                textView.setText("");
                            }
                            de0Var.f(X1, leaVar);
                            de0Var.setRoundRadius(hl.L(28.0f));
                        } else {
                            TLRPC.Chat M02 = uc7.s1(i2).M0(Long.valueOf(n));
                            if (M02 != null) {
                                textView.setText(M02.title);
                            } else {
                                textView.setText("");
                            }
                            leaVar.p(M02);
                            de0Var.f(M0, leaVar);
                        }
                    } else if (E.icon_emoji_id != j) {
                        de0Var.setImageDrawable(null);
                        de0Var.setAnimatedEmojiDrawable(new wl(13, yac.t0, E.icon_emoji_id));
                    } else {
                        de0Var.setAnimatedEmojiDrawable(null);
                        oo4 oo4Var = new oo4(E.icon_color);
                        s26 s26Var = new s26(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        s26Var.a(str);
                        s26Var.i = 1.8f;
                        zm2 zm2Var = new zm2(oo4Var, s26Var, 0, 0);
                        zm2Var.x = true;
                        de0Var.setImageDrawable(zm2Var);
                    }
                    if (M0 != null && M0.forum && !z) {
                        L = hl.L(16.0f);
                    } else {
                        L = hl.L(28.0f);
                    }
                    de0Var.setRoundRadius(L);
                    teaVar.d = dialog.id;
                    teaVar.e = E.id;
                }
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.c;
        if (i != 0 && i != 2) {
            view = new View(context);
            view.setLayoutParams(new r79(-1, a.getCurrentActionBarHeight()));
        } else {
            tea teaVar = new tea(context, this.h.J0);
            teaVar.setLayoutParams(new r79(-1, hl.L(100.0f)));
            view = teaVar;
        }
        return new f89(view);
    }
}
