package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ab5 extends n39 {
    public final Context c;
    public final bb5 d;

    public ab5(bb5 bb5Var, Context context) {
        this.d = bb5Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int b = s49Var.b();
        bb5 bb5Var = this.d;
        if (b != bb5Var.r && b != bb5Var.n && b != bb5Var.s && b != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        bb5 bb5Var = this.d;
        if (bb5Var.e) {
            return 0;
        }
        return bb5Var.x;
    }

    @Override
    public final int d(int i) {
        bb5 bb5Var = this.d;
        if (i != bb5Var.n && i != bb5Var.s && i != bb5Var.r) {
            if (i != bb5Var.w && i != bb5Var.h) {
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
    public final void t(s49 s49Var, int i) {
        String str;
        int i2 = s49Var.f;
        View view = s49Var.a;
        bb5 bb5Var = this.d;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    vgb vgbVar = (vgb) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = bb5Var.f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    vgbVar.a.setText(str);
                    vgbVar.setWillNotDraw(true);
                    return;
                }
                return;
            }
            mhb mhbVar = (mhb) view;
            if (i == bb5Var.w) {
                mhbVar.setText("");
                return;
            } else if (i == bb5Var.h) {
                TLRPC.Chat K0 = bb5Var.getMessagesController().K0(Long.valueOf(bb5Var.d));
                if (hc2.T(K0) && !K0.megagroup) {
                    mhbVar.setText(k96.M0(2131752374, null));
                    return;
                } else {
                    mhbVar.setText(k96.M0(2131748719, null));
                    return;
                }
            } else {
                return;
            }
        }
        uib uibVar = (uib) view;
        if (i == bb5Var.n) {
            uibVar.b(k96.M0(2131751750, null), true);
        } else if (i == bb5Var.s) {
            uibVar.b(k96.M0(2131745266, null), false);
        } else if (i == bb5Var.r) {
            uibVar.b(k96.M0(2131745830, null), true);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        int i2;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.a = textView;
                zkb.X(textView, bkb.F6, null);
                textView.setTextSize(1, 16.0f);
                int i3 = 3;
                if (k96.a0) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                textView.setGravity(i2 | 16);
                if (k96.a0) {
                    i3 = 5;
                }
                frameLayout2.addView(textView, nme.d(-1, -2.0f, i3 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                zkb.h(bkb.c6, null, frameLayout2);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new mhb(context);
            }
        } else {
            FrameLayout uibVar = new uib(context);
            zkb.h(bkb.c6, null, uibVar);
            frameLayout = uibVar;
        }
        return new s49(frameLayout);
    }
}
