package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public class zu3 implements gk7 {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public li3 E;
    public tq4 F;
    public final FrameLayout H;
    public final jq1 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final mu1 a;
    public int b;
    public TLRPC.TL_messages_stickerSet c;
    public boolean n;
    public String w;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Random h = new Random();
    public int r = -1;
    public long s = 0;
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList G = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        N = hashSet;
        hashSet.add("0⃣");
        hashSet.add("1⃣");
        hashSet.add("2⃣");
        hashSet.add("3⃣");
        hashSet.add("4⃣");
        hashSet.add("5⃣");
        hashSet.add("6⃣");
        hashSet.add("7⃣");
        hashSet.add("8⃣");
        hashSet.add("9⃣");
    }

    public zu3(mu1 mu1Var, FrameLayout frameLayout, jq1 jq1Var, int i, long j, long j2) {
        this.a = mu1Var;
        this.H = frameLayout;
        this.I = jq1Var;
        this.b = i;
        this.J = j;
        this.K = j2;
    }

    public static boolean a(gb2 gb2Var, float f, int i) {
        float s = gb2Var.getPhotoImage().s() + gb2Var.getY();
        if (s > f && s < i) {
            return true;
        }
        return false;
    }

    public static int f() {
        float min;
        float f;
        if (gl.O1()) {
            min = gl.P0();
            f = 0.4f;
        } else {
            Point point = gl.q;
            min = Math.min(point.x, point.y);
            f = 0.5f;
        }
        return (int) ((((int) (min * f)) * 2.0f) / gl.p);
    }

    public static java.lang.String p(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu3.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet q0 = hq6.d0(this.b).q0("EmojiAnimations");
            this.c = q0;
            if (q0 == null) {
                q0 = hq6.d0(this.b).o0("EmojiAnimations");
                this.c = q0;
            }
            if (q0 == null) {
                hq6.d0(this.b).d1("EmojiAnimations", false, true);
            }
            if (this.c != null) {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < this.c.documents.size(); i++) {
                    hashMap.put(Long.valueOf(this.c.documents.get(i).id), this.c.documents.get(i));
                }
                for (int i2 = 0; i2 < this.c.packs.size(); i2++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.c.packs.get(i2);
                    if (!N.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = M;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.e;
                        hashMap2.put(str2, arrayList);
                        for (int i3 = 0; i3 < tL_stickerPack.documents.size(); i3++) {
                            arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i3)));
                        }
                        if (tL_stickerPack.emoticon.equals("❤")) {
                            String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                            for (int i4 = 0; i4 < 8; i4++) {
                                String str3 = strArr[i4];
                                hashSet.add(str3);
                                hashMap2.put(str3, arrayList);
                            }
                        }
                    }
                }
                this.d = true;
            }
        }
    }

    public final void c() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i < arrayList.size()) {
                ((yu3) arrayList.get(i)).r.K();
                if (((yu3) arrayList.get(i)).j != null) {
                    ((yu3) arrayList.get(i)).j.d(this.H);
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i, TLRPC.Document document, k27 k27Var, int i2, boolean z, boolean z2, float f, float f2, boolean z3) {
        boolean z4;
        boolean z5;
        Random random;
        long j;
        TLRPC.Document document2;
        int intValue;
        Boolean bool;
        TLRPC.VideoSize F1;
        boolean z6;
        String str2;
        int intValue2;
        li3 li3Var;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i3 = i2;
        if (k27Var != null && k27Var.V3()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (k27Var != null && k27Var.M0() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 || z4 || M.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z5 || ((arrayList != null && !arrayList.isEmpty()) || z4)) {
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    if (i4 < arrayList2.size()) {
                        if (((yu3) arrayList2.get(i4)).p == i) {
                            i5++;
                            if (!z5 && (((yu3) arrayList2.get(i4)).r.y() == null || ((yu3) arrayList2.get(i4)).r.y().t())) {
                                return false;
                            }
                        }
                        if (((yu3) arrayList2.get(i4)).q != null && document != null && ((yu3) arrayList2.get(i4)).q.id == document.id) {
                            i6++;
                        }
                        i4++;
                    } else if (z && z4 && i5 > 0) {
                        m21 m21Var = m21.w;
                        if (m21Var != null && m21Var.b == k27Var.e1()) {
                            return false;
                        }
                        TLRPC.InputStickerSet j1 = k27.j1(k27Var.k);
                        if (j1.short_name != null) {
                            tL_messages_stickerSet = hq6.d0(this.b).q0(j1.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = hq6.d0(this.b).p0(j1.id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = j1;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new pl(this, k27Var, (byte) 29));
                            return false;
                        }
                        o(tL_messages_stickerSet, k27Var);
                        return false;
                    } else if (i5 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z5) {
                            TLRPC.TL_availableEffect M0 = k27Var.M0();
                            TLRPC.messages_AvailableEffects C0 = na7.q1(this.b).C0();
                            if (C0 == null) {
                                return false;
                            }
                            j = 0;
                            long j2 = M0.effect_animation_id;
                            if (j2 == 0) {
                                j2 = M0.effect_sticker_id;
                            }
                            random = random2;
                            int i7 = 0;
                            while (true) {
                                if (i7 < C0.documents.size()) {
                                    document2 = C0.documents.get(i7);
                                    long j3 = j2;
                                    if (document2 != null && document2.id == j3) {
                                        break;
                                    }
                                    i7++;
                                    j2 = j3;
                                } else {
                                    document2 = null;
                                    break;
                                }
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (M0.effect_sticker_id != 0) {
                                F1 = k27.F1(document2);
                                if (F1 != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                            F1 = null;
                        } else {
                            random = random2;
                            j = 0;
                            if (z4) {
                                document2 = k27Var.F0();
                                F1 = k27.F1(k27Var.F0());
                            } else {
                                if (k27Var != null && k27Var.F2()) {
                                    if (i3 >= 0 && i3 <= arrayList.size() - 1) {
                                        intValue = i3;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i8);
                                            if (document3 != null) {
                                                HashMap hashMap = this.L;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.id));
                                                } else {
                                                    bool = null;
                                                }
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i8));
                                                }
                                            }
                                        }
                                        if (arrayList3.isEmpty()) {
                                            intValue = Math.abs(random.nextInt()) % arrayList.size();
                                        } else {
                                            intValue = ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                        }
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(intValue);
                                    i3 = intValue;
                                } else {
                                    if (i3 < 0 || i3 > arrayList.size() - 1) {
                                        i3 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i3);
                                }
                                F1 = null;
                            }
                        }
                        if (document2 == null && F1 == null) {
                            return false;
                        }
                        yu3 yu3Var = new yu3();
                        yu3Var.h = z4;
                        yu3Var.i = z5;
                        if (!z5) {
                            yu3Var.f = ((random.nextInt() % 101) / 100.0f) * (f / 4.0f);
                            yu3Var.g = ((random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                        }
                        yu3Var.p = i;
                        yu3Var.q = document2;
                        yu3Var.m = z3;
                        ImageReceiver imageReceiver = yu3Var.r;
                        imageReceiver.u0 = true;
                        imageReceiver.t0 = z;
                        if (gba.o() > 1) {
                            boolean z7 = w01.a;
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        int i9 = i3;
                        HashMap hashMap2 = this.f;
                        boolean z8 = z4;
                        if (F1 == null) {
                            int f3 = f();
                            boolean z9 = z6;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i10 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(i10));
                            gl5 b = gl5.b(document2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(i10);
                            sb.append("_");
                            imageReceiver.w1 = de9.l(sb, yu3Var.p, "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f3);
                            sb2.append("_");
                            sb2.append(f3);
                            if (!z9) {
                                str3 = "";
                            } else {
                                str3 = "_pcache";
                            }
                            sb2.append(str3);
                            yu3Var.r.d0(b, sb2.toString(), null, "tgs", this.c, 1);
                            imageReceiver.h1 = new xu3(this, yu3Var, z, k27Var);
                            if (imageReceiver.y() != null) {
                                imageReceiver.y().I(0, false, true);
                            }
                        } else {
                            boolean z10 = z6;
                            int f4 = f();
                            if (i6 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(intValue2);
                                sb3.append("_");
                                imageReceiver.w1 = de9.l(sb3, yu3Var.p, "_");
                            }
                            yu3Var.q = document2;
                            gl5 d = gl5.d(F1, document2);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(f4);
                            sb4.append("_");
                            sb4.append(f4);
                            if (!z10) {
                                str2 = "";
                            } else {
                                str2 = "_pcache";
                            }
                            sb4.append(str2);
                            yu3Var.r.d0(d, sb4.toString(), null, "tgs", this.c, 1);
                        }
                        imageReceiver.m0(Integer.MAX_VALUE);
                        imageReceiver.M(0);
                        if (imageReceiver.y() != null) {
                            if (yu3Var.h) {
                                imageReceiver.y().I(0, false, true);
                            }
                            imageReceiver.y().start();
                        }
                        arrayList2.add(yu3Var);
                        imageReceiver.I();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.p0(frameLayout);
                        frameLayout.invalidate();
                        if (z && !z8 && y6c.h(this.b).n != this.J) {
                            int i11 = this.r;
                            if (i11 != 0 && i11 != i && (li3Var = this.E) != null) {
                                gl.r(li3Var);
                                this.E.run();
                            }
                            this.r = i;
                            this.w = str;
                            int i12 = (this.s > j ? 1 : (this.s == j ? 0 : -1));
                            ArrayList arrayList4 = this.y;
                            ArrayList arrayList5 = this.x;
                            if (i12 == 0) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j));
                                arrayList4.add(Integer.valueOf(i9));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i9));
                            }
                            li3 li3Var2 = this.E;
                            if (li3Var2 != null) {
                                gl.r(li3Var2);
                                this.E = null;
                            }
                            li3 li3Var3 = new li3(this, (byte) 18);
                            this.E = li3Var3;
                            gl.d3(li3Var3, 500L);
                        }
                        if (z2) {
                            na7.q1(this.b).H4(11, 0, this.J, this.K, str);
                            return true;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Integer B1;
        if (i == kk7.x0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i3 = kk7.V4;
        long j = this.J;
        if (i == i3) {
            if (this.a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j && M.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i4 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i5);
                                gl.d3(new wu3(this, i4, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i == 2 && (B1 = na7.q1(this.b).B1(j, this.K)) != null && B1.intValue() == 5) {
            tq4 tq4Var = this.F;
            if (tq4Var != null) {
                gl.r(tq4Var);
            }
            this.F = null;
        }
    }

    public final void e(Canvas canvas) {
        ArrayList arrayList;
        float f;
        float f2;
        boolean z;
        boolean z2;
        float f3;
        boolean z3;
        boolean z4;
        ImageReceiver imageReceiver;
        k27 k27Var;
        float f4;
        if (!this.G.isEmpty()) {
            int i = 0;
            while (true) {
                int size = this.G.size();
                arrayList = this.G;
                if (i >= size) {
                    break;
                }
                yu3 yu3Var = (yu3) arrayList.get(i);
                if (this.a != null) {
                    yu3Var.c = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.I.getChildCount()) {
                            View childAt = this.I.getChildAt(i2);
                            if (childAt instanceof gb2) {
                                gb2 gb2Var = (gb2) childAt;
                                k27Var = gb2Var.getMessageObject();
                                imageReceiver = gb2Var.getPhotoImage();
                            } else if (childAt instanceof uk1) {
                                uk1 uk1Var = (uk1) childAt;
                                k27Var = uk1Var.getMessageObject();
                                imageReceiver = uk1Var.getPhotoImage();
                            } else {
                                imageReceiver = null;
                                k27Var = null;
                            }
                            if (k27Var != null && k27Var.e1() == yu3Var.p) {
                                yu3Var.c = true;
                                float x = childAt.getX() + this.I.getX();
                                float y = childAt.getY() + this.I.getY();
                                f3 = childAt.getY();
                                f = 3.0f;
                                float f5 = imageReceiver.N0;
                                yu3Var.d = f5;
                                f2 = 2.0f;
                                yu3Var.e = imageReceiver.O0;
                                if (yu3Var.i && (childAt instanceof gb2)) {
                                    gb2 gb2Var2 = (gb2) childAt;
                                    float f6 = (f() * gl.p) / 1.3f;
                                    float f7 = f6 / 3.0f;
                                    yu3Var.d = f7;
                                    yu3Var.e = f7;
                                    float f8 = f6 / 2.0f;
                                    yu3Var.a = Utilities.i((gb2Var2.getTimeX() + x) - f8, gl.q.x - f6, 0.0f);
                                    yu3Var.b = (gb2Var2.getTimeY() + y) - f8;
                                } else {
                                    boolean z5 = yu3Var.h;
                                    float f9 = x + imageReceiver.L0;
                                    if (z5) {
                                        yu3Var.a = f9;
                                        yu3Var.b = y + imageReceiver.M0;
                                    } else {
                                        float f10 = y + imageReceiver.M0;
                                        if (yu3Var.m) {
                                            f4 = ((-f5) * 2.0f) + gl.L(24.0f) + f9;
                                        } else {
                                            f4 = (-gl.L(24.0f)) + f9;
                                        }
                                        yu3Var.a = f4;
                                        yu3Var.b = f10 - imageReceiver.N0;
                                    }
                                }
                            } else {
                                i2++;
                            }
                        } else {
                            f = 3.0f;
                            f2 = 2.0f;
                            f3 = 0.0f;
                            break;
                        }
                    }
                    if (!yu3Var.c || yu3Var.e + f3 < this.a.P9 || f3 > this.I.getMeasuredHeight() - this.a.Ya) {
                        yu3Var.n = true;
                    }
                    if (yu3Var.h) {
                        float f11 = yu3Var.e / f2;
                        if (this.I.getMeasuredHeight() - f3 <= f11) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((f3 - this.a.P9) + f11 <= 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3 || z4) {
                            yu3Var.n = true;
                        }
                    }
                    if (yu3Var.n) {
                        float f12 = yu3Var.o;
                        if (f12 != 1.0f) {
                            float i3 = Utilities.i(f12 + 0.10666667f, 1.0f, 0.0f);
                            yu3Var.o = i3;
                            yu3Var.r.setAlpha(1.0f - i3);
                            this.a.m1.invalidate();
                        }
                    }
                } else {
                    f = 3.0f;
                    f2 = 2.0f;
                    g(yu3Var);
                }
                if (!yu3Var.l && yu3Var.n) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (yu3Var.h && !yu3Var.i) {
                        float f13 = yu3Var.e;
                        float f14 = 1.49926f * f13;
                        float f15 = 0.0546875f * f14;
                        float f16 = (((f13 / f2) + yu3Var.b) - (f14 / f2)) - (0.00279f * f14);
                        boolean z6 = yu3Var.m;
                        ImageReceiver imageReceiver2 = yu3Var.r;
                        float f17 = yu3Var.a;
                        if (!z6) {
                            imageReceiver2.i0(f17 - f15, f16, f14, f14);
                        } else {
                            imageReceiver2.i0(((f17 + yu3Var.d) - f14) + f15, f16, f14, f14);
                        }
                        if (!yu3Var.m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, yu3Var.r.r(), yu3Var.r.s());
                            yu3Var.r.h(canvas, null);
                            canvas.restore();
                        } else {
                            yu3Var.r.h(canvas, null);
                        }
                    } else {
                        xl xlVar = yu3Var.j;
                        if (xlVar != null) {
                            float f18 = yu3Var.a + yu3Var.f;
                            float f19 = yu3Var.b + yu3Var.g;
                            float f20 = yu3Var.d * f;
                            xlVar.e((int) f18, (int) f19, (int) (f18 + f20), (int) (f19 + f20));
                            yu3Var.j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver3 = yu3Var.r;
                            float f21 = yu3Var.a + yu3Var.f;
                            float f22 = yu3Var.b + yu3Var.g;
                            float f23 = yu3Var.d * f;
                            imageReceiver3.i0(f21, f22, f23, f23);
                            if (!yu3Var.m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, yu3Var.r.r(), yu3Var.r.s());
                                yu3Var.r.h(canvas, null);
                                canvas.restore();
                            } else {
                                yu3Var.r.h(canvas, null);
                            }
                        }
                    }
                }
                xl xlVar2 = yu3Var.j;
                if (xlVar2 != null) {
                    z2 = xlVar2.c();
                } else if (yu3Var.l && yu3Var.r.y() != null && yu3Var.r.y().b0 >= yu3Var.r.y().e[0] - 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yu3Var.o != 1.0f && !z2 && !z) {
                    if (yu3Var.r.y() != null && yu3Var.r.y().l0) {
                        yu3Var.l = true;
                    } else if (yu3Var.r.y() != null && !yu3Var.r.y().l0) {
                        yu3Var.r.y().I(0, true, false);
                        yu3Var.r.y().start();
                    }
                } else {
                    yu3 yu3Var2 = (yu3) this.G.remove(i);
                    if (yu3Var.h && yu3Var.r.y() != null) {
                        yu3Var2.r.y().I(0, true, true);
                    }
                    yu3Var2.r.K();
                    xl xlVar3 = yu3Var2.j;
                    if (xlVar3 != null) {
                        xlVar3.d(this.H);
                    }
                    i--;
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                h();
            }
            this.H.invalidate();
        }
    }

    public final void i() {
        this.n = true;
        b();
        kk7.f(this.b).b(this, kk7.x0);
        kk7.f(this.b).b(this, kk7.V4);
        kk7.f(this.b).b(this, 2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i < arrayList.size()) {
                ((yu3) arrayList.get(i)).r.I();
                if (((yu3) arrayList.get(i)).j != null) {
                    ((yu3) arrayList.get(i)).j.f(this.H);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i = 0;
        this.n = false;
        kk7.f(this.b).n(this, kk7.x0);
        kk7.f(this.b).n(this, kk7.V4);
        kk7.f(this.b).n(this, 2);
        while (true) {
            ArrayList arrayList = this.G;
            if (i < arrayList.size()) {
                ((yu3) arrayList.get(i)).r.K();
                if (((yu3) arrayList.get(i)).j != null) {
                    ((yu3) arrayList.get(i)).j.d(this.H);
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(gb2 gb2Var, mu1 mu1Var, boolean z) {
        TLRPC.Document V;
        if (!mu1Var.y() && gb2Var.getMessageObject() != null && gb2Var.getMessageObject().e1() >= 0) {
            if (gb2Var.getMessageObject().V3() || mu1Var.f != null) {
                boolean n = n(gb2Var, -1, z, false);
                if (z && n) {
                    String V1 = gb2Var.getMessageObject().V1();
                    if (!ow3.a(V1) && !"🍑".equals(V1) && !"⚰".equals(V1) && !gb2Var.getMessageObject().V3() && !gb2Var.getMessageObject().F2()) {
                        try {
                            gb2Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!gb2Var.getMessageObject().V3() && gb2Var.getEffect() == null && (z || gb2Var.getMessageObject().o == null)) {
                    Integer B1 = na7.q1(this.b).B1(this.J, this.K);
                    if ((B1 == null || B1.intValue() != 5) && this.F == null && n) {
                        m21 m21Var = m21.w;
                        if ((m21Var == null || !m21Var.l) && gba.Z0 > 0 && y6c.h(this.b).e() != mu1Var.f.id) {
                            gba.Z0--;
                            a.b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", gba.Z0).apply();
                            if (gb2Var.getMessageObject().F2()) {
                                V = gb2Var.getMessageObject().F0();
                            } else {
                                V = hq6.d0(this.b).V(gb2Var.getMessageObject().V1());
                            }
                            nza nzaVar = new nza(mu1Var.getParentActivity(), null, 1, -1, V, mu1Var.getResourceProvider());
                            nzaVar.c.setVisibility(8);
                            nzaVar.b.setText(vu3.m(gl.S2(k96.a0("EmojiInteractionTapHint", null, 2131751165, mu1Var.f.first_name)), nzaVar.b.getPaint().getFontMetricsInt(), false, null, 0));
                            nzaVar.b.setTypeface(null);
                            nzaVar.b.setMaxLines(3);
                            nzaVar.b.setSingleLine(false);
                            tq4 tq4Var = new tq4(this, m21.g(mu1Var, nzaVar, 2750), false, (byte) 7);
                            this.F = tq4Var;
                            gl.d3(tq4Var, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                gb2Var.getMessageObject().R = false;
                gb2Var.getMessageObject().k.premiumEffectWasPlayed = true;
                mu1Var.getMessagesStorage().U1(this.J, gb2Var.getMessageObject().k);
            }
        }
    }

    public final void l(gb2 gb2Var) {
        ArrayList arrayList;
        k27 messageObject = gb2Var.getMessageObject();
        if (!messageObject.V3()) {
            String V1 = messageObject.V1();
            if (V1 == null) {
                V1 = messageObject.k.message;
            }
            String p = p(V1);
            if (M.contains(p) && (arrayList = (ArrayList) this.e.get(p)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i = 0; i < min; i++) {
                    m((TLRPC.Document) arrayList.get(i));
                }
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.L;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.id))) {
                return;
            }
            HashMap hashMap2 = this.L;
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                this.L = hashMap2;
            }
            hashMap2.put(Long.valueOf(document.id), Boolean.TRUE);
            hq6.d0(this.b).m1(gl5.b(document), 2);
        }
    }

    public final boolean n(gb2 gb2Var, int i, boolean z, boolean z2) {
        if (gb2Var != null && this.G.size() <= 12) {
            k27 messageObject = gb2Var.getMessageObject();
            if (gb2Var.getEffect() != null || gb2Var.getPhotoImage().E()) {
                String V1 = messageObject.V1();
                if (V1 == null) {
                    V1 = messageObject.k.message;
                }
                if (gb2Var.getEffect() != null || V1 != null) {
                    float f = gb2Var.getPhotoImage().O0;
                    float f2 = gb2Var.getPhotoImage().N0;
                    if (gb2Var.getEffect() != null || (f > 0.0f && f2 > 0.0f)) {
                        return d(p(V1), gb2Var.getMessageObject().e1(), gb2Var.getMessageObject().F0(), messageObject, i, z, z2, f2, f, gb2Var.getMessageObject().O3());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, k27 k27Var) {
        mu1 mu1Var = this.a;
        if (mu1Var != null && !na7.q1(this.b).F3() && mu1Var.getParentActivity() != null) {
            nza nzaVar = new nza(this.H.getContext(), null, 1, -1, k27Var.F0(), mu1Var.getResourceProvider());
            nzaVar.b.setText(tL_messages_stickerSet.set.title);
            nzaVar.c.setText(k96.M0(2131746757, null));
            k21 k21Var = new k21(mu1Var.getResourceProvider(), mu1Var.getParentActivity(), true);
            nzaVar.setButton(k21Var);
            k21Var.b = new eu3(this, k27Var, (byte) 1);
            k21Var.e(k96.M0(2131743321, null));
            m21 g = m21.g(mu1Var, nzaVar, 2750);
            g.b = k27Var.e1();
            g.j();
        }
    }

    public void h() {
    }

    public void g(yu3 yu3Var) {
    }

    public zu3(int i, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.b = i;
    }
}
