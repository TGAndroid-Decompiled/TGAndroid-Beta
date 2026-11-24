package defpackage;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class pc0 extends Drawable {
    public static final int[][] L = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public Drawable K;
    public final TextPaint a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public j15 f;
    public boolean g;
    public StaticLayout h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public boolean m;
    public byte n;
    public float o;
    public float p;
    public final StringBuilder q;
    public int r;
    public int s;
    public int t;
    public int u;
    public LinearGradient v;
    public boolean w;
    public boolean x;
    public int y;
    public final ylb z;

    public pc0(ylb ylbVar) {
        this.p = 1.0f;
        this.q = new StringBuilder(5);
        this.r = -1;
        this.w = true;
        this.x = false;
        this.y = 255;
        this.z = ylbVar;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(18.0f));
    }

    public static void a(String str, String str2, String str3, StringBuilder sb) {
        sb.setLength(0);
        if (str3 != null) {
            sb.append(str3);
            return;
        }
        if (str != null && str.length() > 0) {
            sb.append(t(str));
        }
        if (str2 != null && str2.length() > 0) {
            int lastIndexOf = str2.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            sb.append("\u200c");
            sb.append(t(str2));
        } else if (str != null && str.length() > 0) {
            for (int length = str.length() - 1; length >= 0; length--) {
                if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                    int length2 = sb.length();
                    sb.append("\u200c");
                    sb.append(t(str.substring(length2)));
                    return;
                }
            }
        }
    }

    public static int c(long j) {
        return cmb.w0(null, cmb.o8[d(j)], false);
    }

    public static int d(long j) {
        return (int) Math.abs(j % cmb.o8.length);
    }

    public static int e(int i) {
        float[] N0 = cmb.N0(5);
        Color.colorToHSV(i, N0);
        int i2 = (int) N0[0];
        if (i2 >= 345 || i2 < 29) {
            return 0;
        }
        if (i2 < 67) {
            return 1;
        }
        if (i2 < 140) {
            return 3;
        }
        if (i2 < 199) {
            return 4;
        }
        if (i2 < 234) {
            return 5;
        }
        if (i2 < 301) {
            return 2;
        }
        return 6;
    }

    public static String t(String str) {
        ArrayList j = gw3.j(str, null);
        if (!j.isEmpty() && ((ew3) j.get(0)).a == 0) {
            return str.substring(0, ((ew3) j.get(0)).b);
        }
        return str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1)));
    }

    public final int b() {
        boolean z = this.g;
        int i = this.d;
        if (z) {
            int i2 = 0;
            amb i3 = cmb.I.i(false);
            bmb bmbVar = cmb.I;
            if (i3 != null) {
                i2 = i3.c;
            }
            return cmb.B(bmbVar, i2, i);
        }
        return i;
    }

    @Override
    public final void draw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc0.draw(android.graphics.Canvas):void");
    }

    public final void f(int i) {
        boolean z;
        this.n = i;
        boolean z2 = false;
        this.x = false;
        this.c = false;
        this.b = false;
        if (i == 13) {
            int w0 = cmb.w0(null, cmb.O9, false);
            this.e = w0;
            this.d = w0;
        } else {
            ylb ylbVar = this.z;
            if (i == 2) {
                int v0 = cmb.v0(cmb.M7, ylbVar);
                this.e = v0;
                this.d = v0;
            } else if (i != 27 && i != 12 && i != 1 && i != 14) {
                if (i == 20) {
                    this.x = true;
                    this.b = true;
                    this.d = cmb.v0(cmb.Xk, ylbVar);
                    this.e = cmb.v0(cmb.Yk, ylbVar);
                } else if (i == 3) {
                    this.b = true;
                    this.d = cmb.v0(cmb.o8[d(5L)], ylbVar);
                    this.e = cmb.v0(cmb.p8[d(5L)], ylbVar);
                } else if (i == 25) {
                    this.b = true;
                    this.d = cmb.v0(cmb.o8[d(2L)], ylbVar);
                    this.e = cmb.v0(cmb.p8[d(2L)], ylbVar);
                } else if (i == 26) {
                    this.b = true;
                    this.d = cmb.v0(cmb.o8[d(1L)], ylbVar);
                    this.e = cmb.v0(cmb.p8[d(1L)], ylbVar);
                } else if (i == 4) {
                    this.b = true;
                    this.d = cmb.v0(cmb.o8[d(5L)], ylbVar);
                    this.e = cmb.v0(cmb.p8[d(5L)], ylbVar);
                } else if (i == 5) {
                    this.b = true;
                    this.d = cmb.v0(cmb.o8[d(4L)], ylbVar);
                    this.e = cmb.v0(cmb.p8[d(4L)], ylbVar);
                } else if (i != 6 && i != 23) {
                    if (i != 7 && i != 24) {
                        if (i == 8) {
                            this.b = true;
                            this.d = cmb.v0(cmb.o8[d(0L)], ylbVar);
                            this.e = cmb.v0(cmb.p8[d(0L)], ylbVar);
                        } else if (i == 9) {
                            this.b = true;
                            this.d = cmb.v0(cmb.o8[d(6L)], ylbVar);
                            this.e = cmb.v0(cmb.p8[d(6L)], ylbVar);
                        } else if (i == 10) {
                            this.b = true;
                            this.d = cmb.v0(cmb.o8[d(5L)], ylbVar);
                            this.e = cmb.v0(cmb.p8[d(5L)], ylbVar);
                        } else if (i == 17) {
                            this.b = true;
                            this.d = cmb.v0(cmb.o8[d(5L)], ylbVar);
                            this.e = cmb.v0(cmb.p8[d(5L)], ylbVar);
                        } else if (i == 21) {
                            this.c = true;
                            j15 j15Var = this.f;
                            if (j15Var == null) {
                                j15Var = new j15();
                                this.f = j15Var;
                            }
                            j15Var.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i == 22) {
                            this.c = true;
                            j15 j15Var2 = this.f;
                            if (j15Var2 == null) {
                                j15Var2 = new j15();
                                this.f = j15Var2;
                            }
                            j15Var2.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.b = true;
                            this.d = cmb.v0(cmb.o8[d(4L)], ylbVar);
                            this.e = cmb.v0(cmb.p8[d(4L)], ylbVar);
                        }
                    } else {
                        this.b = true;
                        this.d = cmb.v0(cmb.o8[d(1L)], ylbVar);
                        this.e = cmb.v0(cmb.p8[d(1L)], ylbVar);
                    }
                } else {
                    this.b = true;
                    this.d = cmb.v0(cmb.o8[d(3L)], ylbVar);
                    this.e = cmb.v0(cmb.p8[d(3L)], ylbVar);
                }
            } else {
                this.b = true;
                this.d = cmb.v0(cmb.J7, ylbVar);
                this.e = cmb.v0(cmb.K7, ylbVar);
            }
        }
        byte b = this.n;
        if (b != 2 && b != 1 && b != 20 && b != 21 && b != 27 && b != 12 && b != 14) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (b == 13 || b == 2 || b == 27 || b == 12 || b == 1 || b == 14 || b == 20) {
            z2 = true;
        }
        this.G = z2;
        this.H = this.d;
        this.I = this.e;
        this.J = anb.b;
    }

    public final void g(int i) {
        this.b = false;
        this.c = false;
        this.e = i;
        this.d = i;
        this.g = false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i, int i2) {
        this.b = true;
        this.c = false;
        this.d = i;
        this.e = i2;
        this.g = false;
    }

    public final void i(long j, String str, String str2) {
        j(j, str, str2, null);
    }

    public final void j(long j, String str, String str2, Integer num) {
        boolean z = true;
        this.A = true;
        this.b = true;
        this.c = false;
        if (num != null) {
            r(num.intValue());
        } else {
            int i = cmb.o8[d(j)];
            ylb ylbVar = this.z;
            this.d = cmb.v0(i, ylbVar);
            this.e = cmb.v0(cmb.p8[d(j)], ylbVar);
            this.C = d(j);
            this.D = this.d;
            this.E = this.e;
            this.B = true;
            this.F = anb.b;
        }
        if (j != 5) {
            z = false;
        }
        this.g = z;
        this.n = (byte) 0;
        this.m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.q);
    }

    public final void k(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            q((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            p((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            m((TLRPC.ChatInvite) tLObject);
        }
    }

    public final void l(TLRPC.Chat chat) {
        p(chat);
    }

    public final void m(TLRPC.ChatInvite chatInvite) {
        Integer num;
        String str = chatInvite.title;
        TLRPC.Chat chat = chatInvite.chat;
        if (chat != null && chat.color != null) {
            num = Integer.valueOf(sd2.F(chat));
        } else {
            num = null;
        }
        j(0L, str, null, num);
    }

    public final void n(TLRPC.User user) {
        q(user);
    }

    public final void o(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            q((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            p((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            m((TLRPC.ChatInvite) tLObject);
        }
    }

    public final void p(TLRPC.Chat chat) {
        Integer num;
        if (chat != null) {
            long j = chat.id;
            String str = chat.title;
            if (chat.color != null) {
                num = Integer.valueOf(sd2.F(chat));
            } else {
                num = null;
            }
            j(j, str, null, num);
        }
    }

    public final void q(TLRPC.User user) {
        Integer num;
        if (user != null) {
            long j = user.id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(m9c.f(user));
            } else {
                num = null;
            }
            j(j, str, str2, num);
            this.m = m9c.z(user);
        }
    }

    public final void r(int i) {
        j15 j15Var = this.f;
        if (j15Var != null) {
            this.b = false;
            this.c = true;
        } else {
            this.b = true;
            this.c = false;
        }
        int[][] iArr = L;
        ylb ylbVar = this.z;
        if (i >= 14) {
            oc7 r1 = oc7.r1(z8c.t0);
            fc7 fc7Var = r1.E3;
            if (fc7Var != null && fc7Var.d(i) != null) {
                int f = r1.E3.d(i).f();
                if (this.f != null) {
                    int[] iArr2 = iArr[e(f)];
                    this.f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = cmb.v0(cmb.o8[e(f)], ylbVar);
                this.e = cmb.v0(cmb.p8[e(f)], ylbVar);
            } else if (this.f != null) {
                int[] iArr3 = iArr[d(i)];
                this.f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j = i;
                this.d = cmb.v0(cmb.o8[d(j)], ylbVar);
                this.e = cmb.v0(cmb.p8[d(j)], ylbVar);
            }
        } else if (j15Var != null) {
            int[] iArr4 = iArr[d(i)];
            this.f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j2 = i;
            this.d = cmb.v0(cmb.o8[d(j2)], ylbVar);
            this.e = cmb.v0(cmb.p8[d(j2)], ylbVar);
        }
    }

    public final void s(int i) {
        this.a.setTextSize(i);
    }

    @Override
    public final void setAlpha(int i) {
        this.y = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public pc0(int i, TLRPC.User user) {
        this((ylb) null);
        this.l = false;
        if (user != null) {
            j(user.id, user.first_name, user.last_name, null);
            this.m = m9c.z(user);
        }
    }

    public pc0(TLRPC.Chat chat) {
        this((ylb) null);
        this.l = false;
        p(chat);
    }

    public pc0() {
        this((ylb) null);
    }
}
