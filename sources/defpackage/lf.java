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
public final class lf implements fd, b86, on5, mz6, pz6, if7, ot2 {
    public final byte a;
    public final long b;
    public final int c;
    public final Object d;

    public lf(uj ujVar, int i, long j, long j2) {
        this.a = (byte) 2;
        this.d = ujVar;
        this.c = i;
        this.b = j;
    }

    @Override
    public final void a(String str) {
        ((eja) this.d).F0(this.c, str, this.b);
    }

    @Override
    public final void accept(Object obj) {
        boolean z;
        seb sebVar = (seb) this.d;
        p43 p43Var = (p43) obj;
        sebVar.h.getClass();
        byte[] l3 = z6f.l3(p43Var.a, p43Var.c);
        ey7 ey7Var = sebVar.c;
        ey7Var.L(l3.length, l3);
        sebVar.a.e(l3.length, ey7Var);
        long j = p43Var.b;
        int i = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
        ko4 ko4Var = sebVar.h;
        long j2 = this.b;
        if (i == 0) {
            if (ko4Var.y == Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
        } else {
            long j3 = ko4Var.y;
            if (j3 == Long.MAX_VALUE) {
                j2 += j;
            } else {
                j2 = j + j3;
            }
        }
        sebVar.a.a(j2, this.c | 1, l3.length, 0, null);
    }

    @Override
    public final void d(og8 og8Var, xw6 xw6Var) {
        og8Var.p(((sz6) this.d).f(xw6Var, og8Var, this.c), this.b);
    }

    @Override
    public final void invoke(Object obj) {
        vj vjVar = (vj) obj;
        vjVar.n((uj) this.d, this.c, this.b);
    }

    @Override
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        long j;
        try {
            po5 a = f31.a((IBinder) this.d);
            mo5 p = po5.p();
            for (int i2 = 0; i2 < a.size(); i2++) {
                Bundle bundle = (Bundle) a.get(i2);
                bundle.getClass();
                p.c(ft6.a(xw6Var.c, bundle));
            }
            j99 f = p.f();
            int i3 = this.c;
            if (i3 == -1) {
                yx6Var.t();
                i3 = yx6Var.t.l0();
                yx6Var.t();
                j = yx6Var.t.k();
            } else {
                j = this.b;
            }
            return yx6Var.o(xw6Var, f, i3, j);
        } catch (RuntimeException e) {
            efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return fne.b(e);
        }
    }

    @Override
    public final void v(org.telegram.messenger.ImageReceiver r4, boolean r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf.v(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                EditText editText = (EditText) obj;
                String str = "";
                if (j > 0) {
                    TLRPC.UserFull Y1 = uc7.s1(i2).Y1(yac.h(i2).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (Y1 != null) {
                        String str2 = Y1.about;
                        if (str2 != null) {
                            str = str2;
                        }
                        if (str.equals(trim)) {
                            hl.t1(editText);
                            idVar.dismiss();
                            return;
                        }
                        Y1.about = trim;
                        jn7.f(i2).k(68, Long.valueOf(j), Y1);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    jn7.e().k(296, 2, Long.valueOf(j));
                    ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new xe2((byte) 0), 2);
                } else {
                    long j2 = -j;
                    TLRPC.ChatFull N0 = uc7.s1(i2).N0(j2);
                    String obj2 = editText.getText().toString();
                    if (N0 != null) {
                        String str3 = N0.about;
                        if (str3 != null) {
                            str = str3;
                        }
                        if (str.equals(obj2)) {
                            hl.t1(editText);
                            idVar.dismiss();
                            return;
                        }
                        N0.about = obj2;
                        jn7 f = jn7.f(i2);
                        Boolean bool = Boolean.FALSE;
                        f.k(31, N0, 0, bool, bool);
                    }
                    jn7.e().k(296, 2, Long.valueOf(j));
                    uc7 s1 = uc7.s1(i2);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = s1.j1(-j2);
                    tL_messages_editChatAbout.about = obj2;
                    s1.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new m65(s1, N0, obj2, (byte) 20), 64);
                }
                idVar.dismiss();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = uc7.s1(yac.t0).X3.edit();
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

    public lf(long j, int i, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = i;
        this.d = obj;
    }

    public lf(Object obj, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = j;
    }

    public lf(Object obj, long j, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }
}
