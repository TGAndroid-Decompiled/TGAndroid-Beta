package defpackage;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.EditText;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gf implements ed, x56, ll5, ix6, lx6, yc7, us2 {
    public final byte a;
    public final long b;
    public final int c;
    public final Object d;

    public gf(tj tjVar, int i, long j, long j2) {
        this.a = (byte) 2;
        this.d = tjVar;
        this.c = i;
        this.b = j;
    }

    @Override
    public final void C(org.telegram.messenger.ImageReceiver r4, boolean r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf.C(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public final void a(String str) {
        ((nfa) this.d).F0(this.c, str, this.b);
    }

    @Override
    public final void accept(Object obj) {
        boolean z;
        vab vabVar = (vab) this.d;
        x33 x33Var = (x33) obj;
        vabVar.h.getClass();
        byte[] l3 = i2f.l3(x33Var.a, x33Var.c);
        xu7 xu7Var = vabVar.c;
        xu7Var.L(l3.length, l3);
        vabVar.a.e(l3.length, xu7Var);
        long j = x33Var.b;
        int i = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
        fm4 fm4Var = vabVar.h;
        long j2 = this.b;
        if (i == 0) {
            if (fm4Var.y == Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
        } else {
            long j3 = fm4Var.y;
            if (j3 == Long.MAX_VALUE) {
                j2 += j;
            } else {
                j2 = j + j3;
            }
        }
        vabVar.a.a(j2, this.c | 1, l3.length, 0, null);
    }

    @Override
    public final void g(ad8 ad8Var, su6 su6Var) {
        ad8Var.p(((ox6) this.d).f(su6Var, ad8Var, this.c), this.b);
    }

    @Override
    public final void invoke(Object obj) {
        uj ujVar = (uj) obj;
        ujVar.n((tj) this.d, this.c, this.b);
    }

    @Override
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        long j;
        try {
            mm5 a = w21.a((IBinder) this.d);
            jm5 p = mm5.p();
            for (int i2 = 0; i2 < a.size(); i2++) {
                Bundle bundle = (Bundle) a.get(i2);
                bundle.getClass();
                p.c(br6.a(su6Var.c, bundle));
            }
            w59 f = p.f();
            int i3 = this.c;
            if (i3 == -1) {
                tv6Var.t();
                i3 = tv6Var.t.l0();
                tv6Var.t();
                j = tv6Var.t.m();
            } else {
                j = this.b;
            }
            return tv6Var.o(su6Var, f, i3, j);
        } catch (RuntimeException e) {
            lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return jie.b(e);
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                EditText editText = (EditText) obj;
                String str = "";
                if (j > 0) {
                    TLRPC.UserFull W1 = na7.q1(i2).W1(y6c.h(i2).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (W1 != null) {
                        String str2 = W1.about;
                        if (str2 != null) {
                            str = str2;
                        }
                        if (str.equals(trim)) {
                            gl.t1(editText);
                            hdVar.dismiss();
                            return;
                        }
                        W1.about = trim;
                        kk7.f(i2).k(67, Long.valueOf(j), W1);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    kk7.e().k(295, 2, Long.valueOf(j));
                    ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new ce2((byte) 0), 2);
                } else {
                    long j2 = -j;
                    TLRPC.ChatFull L0 = na7.q1(i2).L0(j2);
                    String obj2 = editText.getText().toString();
                    if (L0 != null) {
                        String str3 = L0.about;
                        if (str3 != null) {
                            str = str3;
                        }
                        if (str.equals(obj2)) {
                            gl.t1(editText);
                            hdVar.dismiss();
                            return;
                        }
                        L0.about = obj2;
                        kk7 f = kk7.f(i2);
                        Boolean bool = Boolean.FALSE;
                        f.k(30, L0, 0, bool, bool);
                    }
                    kk7.e().k(295, 2, Long.valueOf(j));
                    na7 q1 = na7.q1(i2);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = q1.h1(-j2);
                    tL_messages_editChatAbout.about = obj2;
                    q1.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new k45(q1, L0, obj2, (byte) 21), 64);
                }
                hdVar.dismiss();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = na7.q1(y6c.t0).W3.edit();
                if (j != 0) {
                    edit.putInt("color_" + j, 0);
                } else if (i2 == 1) {
                    edit.putInt("MessagesLed", 0);
                } else if (i2 == 0) {
                    edit.putInt("GroupLed", 0);
                } else if (i2 == 3) {
                    edit.putInt("StoriesLed", 0);
                } else if (i2 != 5 && i2 != 4) {
                    edit.putInt("ChannelLed", 0);
                } else {
                    edit.putInt("ReactionsLed", 0);
                }
                edit.commit();
                runnable.run();
                return;
        }
    }

    public gf(long j, int i, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = i;
        this.d = obj;
    }

    public gf(Object obj, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = j;
    }

    public gf(Object obj, long j, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }
}
