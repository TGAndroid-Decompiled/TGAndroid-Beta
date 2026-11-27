package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class cd5 extends c79 {
    public final Context c;
    public final dd5 d;

    public cd5(dd5 dd5Var, Context context) {
        this.d = dd5Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int b = f89Var.b();
        dd5 dd5Var = this.d;
        if (b != dd5Var.r && b != dd5Var.n && b != dd5Var.s && b != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        dd5 dd5Var = this.d;
        if (dd5Var.e) {
            return 0;
        }
        return dd5Var.x;
    }

    @Override
    public final int d(int i) {
        dd5 dd5Var = this.d;
        if (i != dd5Var.n && i != dd5Var.s && i != dd5Var.r) {
            if (i != dd5Var.w && i != dd5Var.h) {
                if (i == 0) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String str;
        int i2 = f89Var.f;
        View view = f89Var.a;
        dd5 dd5Var = this.d;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    rkb rkbVar = (rkb) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = dd5Var.f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    rkbVar.a.setText(str);
                    rkbVar.setWillNotDraw(true);
                    return;
                }
                return;
            }
            ilb ilbVar = (ilb) view;
            if (i == dd5Var.w) {
                ilbVar.setText("");
                return;
            } else if (i == dd5Var.h) {
                TLRPC.Chat M0 = dd5Var.getMessagesController().M0(Long.valueOf(dd5Var.d));
                if (xc2.T(M0) && !M0.megagroup) {
                    ilbVar.setText(ob6.M0(2131752358, null));
                    return;
                } else {
                    ilbVar.setText(ob6.M0(2131748665, null));
                    return;
                }
            } else {
                return;
            }
        }
        qmb qmbVar = (qmb) view;
        if (i == dd5Var.n) {
            qmbVar.b(ob6.M0(2131751727, null), true);
        } else if (i == dd5Var.s) {
            qmbVar.b(ob6.M0(2131745186, null), false);
        } else if (i == dd5Var.r) {
            qmbVar.b(ob6.M0(2131745750, null), true);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        int i2;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.a = textView;
                yob.X(textView, aob.G6, null);
                textView.setTextSize(1, 16.0f);
                int i3 = 3;
                if (ob6.a0) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                textView.setGravity(i2 | 16);
                if (ob6.a0) {
                    i3 = 5;
                }
                frameLayout2.addView(textView, tre.d(-1, -2.0f, i3 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                yob.h(aob.d6, null, frameLayout2);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new ilb(context);
            }
        } else {
            FrameLayout qmbVar = new qmb(context);
            yob.h(aob.d6, null, qmbVar);
            frameLayout = qmbVar;
        }
        return new f89(frameLayout);
    }
}
