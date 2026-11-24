package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class yc5 extends q59 {
    public final Context c;
    public final zc5 d;

    public yc5(zc5 zc5Var, Context context) {
        this.d = zc5Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int b = u69Var.b();
        zc5 zc5Var = this.d;
        if (b != zc5Var.r && b != zc5Var.n && b != zc5Var.s && b != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        zc5 zc5Var = this.d;
        if (zc5Var.e) {
            return 0;
        }
        return zc5Var.x;
    }

    @Override
    public final int d(int i) {
        zc5 zc5Var = this.d;
        if (i != zc5Var.n && i != zc5Var.s && i != zc5Var.r) {
            if (i != zc5Var.w && i != zc5Var.h) {
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
    public final void t(u69 u69Var, int i) {
        String str;
        int i2 = u69Var.f;
        View view = u69Var.a;
        zc5 zc5Var = this.d;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    wib wibVar = (wib) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = zc5Var.f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    wibVar.a.setText(str);
                    wibVar.setWillNotDraw(true);
                    return;
                }
                return;
            }
            njb njbVar = (njb) view;
            if (i == zc5Var.w) {
                njbVar.setText("");
                return;
            } else if (i == zc5Var.h) {
                TLRPC.Chat L0 = zc5Var.getMessagesController().L0(Long.valueOf(zc5Var.d));
                if (sd2.T(L0) && !L0.megagroup) {
                    njbVar.setText(jb6.M0(2131752330, null));
                    return;
                } else {
                    njbVar.setText(jb6.M0(2131748668, null));
                    return;
                }
            } else {
                return;
            }
        }
        vkb vkbVar = (vkb) view;
        if (i == zc5Var.n) {
            vkbVar.b(jb6.M0(2131751699, null), true);
        } else if (i == zc5Var.s) {
            vkbVar.b(jb6.M0(2131745192, null), false);
        } else if (i == zc5Var.r) {
            vkbVar.b(jb6.M0(2131745756, null), true);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        int i2;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.a = textView;
                anb.X(textView, cmb.F6, null);
                textView.setTextSize(1, 16.0f);
                int i3 = 3;
                if (jb6.a0) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                textView.setGravity(i2 | 16);
                if (jb6.a0) {
                    i3 = 5;
                }
                frameLayout2.addView(textView, qoe.d(-1, -2.0f, i3 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                anb.h(cmb.c6, null, frameLayout2);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new njb(context);
            }
        } else {
            FrameLayout vkbVar = new vkb(context);
            anb.h(cmb.c6, null, vkbVar);
            frameLayout = vkbVar;
        }
        return new u69(frameLayout);
    }
}
