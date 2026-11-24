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
public class kw3 implements jm7 {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public bi3 E;
    public us4 F;
    public final FrameLayout H;
    public final vr1 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final yv1 a;
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

    public kw3(yv1 yv1Var, FrameLayout frameLayout, vr1 vr1Var, int i, long j, long j2) {
        this.a = yv1Var;
        this.H = frameLayout;
        this.I = vr1Var;
        this.b = i;
        this.J = j;
        this.K = j2;
    }

    public static boolean a(rc2 rc2Var, float f, int i) {
        float s = rc2Var.getPhotoImage().s() + rc2Var.getY();
        if (s > f && s < i) {
            return true;
        }
        return false;
    }

    public static int f() {
        float min;
        float f;
        if (gm.O1()) {
            min = gm.P0();
            f = 0.4f;
        } else {
            Point point = gm.q;
            min = Math.min(point.x, point.y);
            f = 0.5f;
        }
        return (int) ((((int) (min * f)) * 2.0f) / gm.p);
    }

    public static java.lang.String p(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw3.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet q0 = hs6.d0(this.b).q0("EmojiAnimations");
            this.c = q0;
            if (q0 == null) {
                q0 = hs6.d0(this.b).o0("EmojiAnimations");
                this.c = q0;
            }
            if (q0 == null) {
                hs6.d0(this.b).d1("EmojiAnimations", false, true);
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
                ((jw3) arrayList.get(i)).r.K();
                if (((jw3) arrayList.get(i)).j != null) {
                    ((jw3) arrayList.get(i)).j.d(this.H);
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i, TLRPC.Document document, k47 k47Var, int i2, boolean z, boolean z2, float f, float f2, boolean z3) {
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
        bi3 bi3Var;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i3 = i2;
        if (k47Var != null && k47Var.V3()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (k47Var != null && k47Var.M0() != null) {
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
                        if (((jw3) arrayList2.get(i4)).p == i) {
                            i5++;
                            if (!z5 && (((jw3) arrayList2.get(i4)).r.y() == null || ((jw3) arrayList2.get(i4)).r.y().t())) {
                                return false;
                            }
                        }
                        if (((jw3) arrayList2.get(i4)).q != null && document != null && ((jw3) arrayList2.get(i4)).q.id == document.id) {
                            i6++;
                        }
                        i4++;
                    } else if (z && z4 && i5 > 0) {
                        u31 u31Var = u31.x;
                        if (u31Var != null && u31Var.b == k47Var.e1()) {
                            return false;
                        }
                        TLRPC.InputStickerSet j1 = k47.j1(k47Var.k);
                        if (j1.short_name != null) {
                            tL_messages_stickerSet = hs6.d0(this.b).q0(j1.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = hs6.d0(this.b).p0(j1.id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = j1;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new pm(this, k47Var, (byte) 29));
                            return false;
                        }
                        o(tL_messages_stickerSet, k47Var);
                        return false;
                    } else if (i5 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z5) {
                            TLRPC.TL_availableEffect M0 = k47Var.M0();
                            TLRPC.messages_AvailableEffects D0 = oc7.r1(this.b).D0();
                            if (D0 == null) {
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
                                if (i7 < D0.documents.size()) {
                                    document2 = D0.documents.get(i7);
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
                                F1 = k47.F1(document2);
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
                                document2 = k47Var.F0();
                                F1 = k47.F1(k47Var.F0());
                            } else {
                                if (k47Var != null && k47Var.F2()) {
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
                        jw3 jw3Var = new jw3();
                        jw3Var.h = z4;
                        jw3Var.i = z5;
                        if (!z5) {
                            jw3Var.f = ((random.nextInt() % 101) / 100.0f) * (f / 4.0f);
                            jw3Var.g = ((random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                        }
                        jw3Var.p = i;
                        jw3Var.q = document2;
                        jw3Var.m = z3;
                        ImageReceiver imageReceiver = jw3Var.r;
                        imageReceiver.u0 = true;
                        imageReceiver.t0 = z;
                        if (gda.o() > 1) {
                            boolean z7 = e21.a;
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
                            gn5 b = gn5.b(document2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(i10);
                            sb.append("_");
                            imageReceiver.w1 = hg9.k(sb, jw3Var.p, "_");
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
                            jw3Var.r.d0(b, sb2.toString(), null, "tgs", this.c, 1);
                            imageReceiver.h1 = new iw3(this, jw3Var, z, k47Var);
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
                                imageReceiver.w1 = hg9.k(sb3, jw3Var.p, "_");
                            }
                            jw3Var.q = document2;
                            gn5 d = gn5.d(F1, document2);
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
                            jw3Var.r.d0(d, sb4.toString(), null, "tgs", this.c, 1);
                        }
                        imageReceiver.m0(Integer.MAX_VALUE);
                        imageReceiver.M(0);
                        if (imageReceiver.y() != null) {
                            if (jw3Var.h) {
                                imageReceiver.y().I(0, false, true);
                            }
                            imageReceiver.y().start();
                        }
                        arrayList2.add(jw3Var);
                        imageReceiver.I();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.p0(frameLayout);
                        frameLayout.invalidate();
                        if (z && !z8 && z8c.h(this.b).n != this.J) {
                            int i11 = this.r;
                            if (i11 != 0 && i11 != i && (bi3Var = this.E) != null) {
                                gm.r(bi3Var);
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
                            bi3 bi3Var2 = this.E;
                            if (bi3Var2 != null) {
                                gm.r(bi3Var2);
                                this.E = null;
                            }
                            bi3 bi3Var3 = new bi3(this, (byte) 23);
                            this.E = bi3Var3;
                            gm.d3(bi3Var3, 500L);
                        }
                        if (z2) {
                            oc7.r1(this.b).J4(11, 0, this.J, this.K, str);
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
        Integer C1;
        if (i == nm7.y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i3 = nm7.X4;
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
                                gm.d3(new hw3(this, i4, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i == 2 && (C1 = oc7.r1(this.b).C1(j, this.K)) != null && C1.intValue() == 5) {
            us4 us4Var = this.F;
            if (us4Var != null) {
                gm.r(us4Var);
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
        k47 k47Var;
        float f4;
        if (!this.G.isEmpty()) {
            int i = 0;
            while (true) {
                int size = this.G.size();
                arrayList = this.G;
                if (i >= size) {
                    break;
                }
                jw3 jw3Var = (jw3) arrayList.get(i);
                if (this.a != null) {
                    jw3Var.c = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.I.getChildCount()) {
                            View childAt = this.I.getChildAt(i2);
                            if (childAt instanceof rc2) {
                                rc2 rc2Var = (rc2) childAt;
                                k47Var = rc2Var.getMessageObject();
                                imageReceiver = rc2Var.getPhotoImage();
                            } else if (childAt instanceof cm1) {
                                cm1 cm1Var = (cm1) childAt;
                                k47Var = cm1Var.getMessageObject();
                                imageReceiver = cm1Var.getPhotoImage();
                            } else {
                                imageReceiver = null;
                                k47Var = null;
                            }
                            if (k47Var != null && k47Var.e1() == jw3Var.p) {
                                jw3Var.c = true;
                                float x = childAt.getX() + this.I.getX();
                                float y = childAt.getY() + this.I.getY();
                                f3 = childAt.getY();
                                f = 3.0f;
                                float f5 = imageReceiver.N0;
                                jw3Var.d = f5;
                                f2 = 2.0f;
                                jw3Var.e = imageReceiver.O0;
                                if (jw3Var.i && (childAt instanceof rc2)) {
                                    rc2 rc2Var2 = (rc2) childAt;
                                    float f6 = (f() * gm.p) / 1.3f;
                                    float f7 = f6 / 3.0f;
                                    jw3Var.d = f7;
                                    jw3Var.e = f7;
                                    float f8 = f6 / 2.0f;
                                    jw3Var.a = Utilities.i((rc2Var2.getTimeX() + x) - f8, gm.q.x - f6, 0.0f);
                                    jw3Var.b = (rc2Var2.getTimeY() + y) - f8;
                                } else {
                                    boolean z5 = jw3Var.h;
                                    float f9 = x + imageReceiver.L0;
                                    if (z5) {
                                        jw3Var.a = f9;
                                        jw3Var.b = y + imageReceiver.M0;
                                    } else {
                                        float f10 = y + imageReceiver.M0;
                                        if (jw3Var.m) {
                                            f4 = ((-f5) * 2.0f) + gm.L(24.0f) + f9;
                                        } else {
                                            f4 = (-gm.L(24.0f)) + f9;
                                        }
                                        jw3Var.a = f4;
                                        jw3Var.b = f10 - imageReceiver.N0;
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
                    if (!jw3Var.c || jw3Var.e + f3 < this.a.P9 || f3 > this.I.getMeasuredHeight() - this.a.Ya) {
                        jw3Var.n = true;
                    }
                    if (jw3Var.h) {
                        float f11 = jw3Var.e / f2;
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
                            jw3Var.n = true;
                        }
                    }
                    if (jw3Var.n) {
                        float f12 = jw3Var.o;
                        if (f12 != 1.0f) {
                            float i3 = Utilities.i(f12 + 0.10666667f, 1.0f, 0.0f);
                            jw3Var.o = i3;
                            jw3Var.r.setAlpha(1.0f - i3);
                            this.a.m1.invalidate();
                        }
                    }
                } else {
                    f = 3.0f;
                    f2 = 2.0f;
                    g(jw3Var);
                }
                if (!jw3Var.l && jw3Var.n) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (jw3Var.h && !jw3Var.i) {
                        float f13 = jw3Var.e;
                        float f14 = 1.49926f * f13;
                        float f15 = 0.0546875f * f14;
                        float f16 = (((f13 / f2) + jw3Var.b) - (f14 / f2)) - (0.00279f * f14);
                        boolean z6 = jw3Var.m;
                        ImageReceiver imageReceiver2 = jw3Var.r;
                        float f17 = jw3Var.a;
                        if (!z6) {
                            imageReceiver2.i0(f17 - f15, f16, f14, f14);
                        } else {
                            imageReceiver2.i0(((f17 + jw3Var.d) - f14) + f15, f16, f14, f14);
                        }
                        if (!jw3Var.m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, jw3Var.r.r(), jw3Var.r.s());
                            jw3Var.r.h(canvas, null);
                            canvas.restore();
                        } else {
                            jw3Var.r.h(canvas, null);
                        }
                    } else {
                        xm xmVar = jw3Var.j;
                        if (xmVar != null) {
                            float f18 = jw3Var.a + jw3Var.f;
                            float f19 = jw3Var.b + jw3Var.g;
                            float f20 = jw3Var.d * f;
                            xmVar.e((int) f18, (int) f19, (int) (f18 + f20), (int) (f19 + f20));
                            jw3Var.j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver3 = jw3Var.r;
                            float f21 = jw3Var.a + jw3Var.f;
                            float f22 = jw3Var.b + jw3Var.g;
                            float f23 = jw3Var.d * f;
                            imageReceiver3.i0(f21, f22, f23, f23);
                            if (!jw3Var.m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, jw3Var.r.r(), jw3Var.r.s());
                                jw3Var.r.h(canvas, null);
                                canvas.restore();
                            } else {
                                jw3Var.r.h(canvas, null);
                            }
                        }
                    }
                }
                xm xmVar2 = jw3Var.j;
                if (xmVar2 != null) {
                    z2 = xmVar2.c();
                } else if (jw3Var.l && jw3Var.r.y() != null && jw3Var.r.y().b0 >= jw3Var.r.y().e[0] - 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (jw3Var.o != 1.0f && !z2 && !z) {
                    if (jw3Var.r.y() != null && jw3Var.r.y().l0) {
                        jw3Var.l = true;
                    } else if (jw3Var.r.y() != null && !jw3Var.r.y().l0) {
                        jw3Var.r.y().I(0, true, false);
                        jw3Var.r.y().start();
                    }
                } else {
                    jw3 jw3Var2 = (jw3) this.G.remove(i);
                    if (jw3Var.h && jw3Var.r.y() != null) {
                        jw3Var2.r.y().I(0, true, true);
                    }
                    jw3Var2.r.K();
                    xm xmVar3 = jw3Var2.j;
                    if (xmVar3 != null) {
                        xmVar3.d(this.H);
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
        nm7.f(this.b).b(this, nm7.y0);
        nm7.f(this.b).b(this, nm7.X4);
        nm7.f(this.b).b(this, 2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i < arrayList.size()) {
                ((jw3) arrayList.get(i)).r.I();
                if (((jw3) arrayList.get(i)).j != null) {
                    ((jw3) arrayList.get(i)).j.f(this.H);
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
        nm7.f(this.b).n(this, nm7.y0);
        nm7.f(this.b).n(this, nm7.X4);
        nm7.f(this.b).n(this, 2);
        while (true) {
            ArrayList arrayList = this.G;
            if (i < arrayList.size()) {
                ((jw3) arrayList.get(i)).r.K();
                if (((jw3) arrayList.get(i)).j != null) {
                    ((jw3) arrayList.get(i)).j.d(this.H);
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(rc2 rc2Var, yv1 yv1Var, boolean z) {
        TLRPC.Document V;
        if (!yv1Var.x() && rc2Var.getMessageObject() != null && rc2Var.getMessageObject().e1() >= 0) {
            if (rc2Var.getMessageObject().V3() || yv1Var.f != null) {
                boolean n = n(rc2Var, -1, z, false);
                if (z && n) {
                    String V1 = rc2Var.getMessageObject().V1();
                    if (!zx3.a(V1) && !"🍑".equals(V1) && !"⚰".equals(V1) && !rc2Var.getMessageObject().V3() && !rc2Var.getMessageObject().F2()) {
                        try {
                            rc2Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!rc2Var.getMessageObject().V3() && rc2Var.getEffect() == null && (z || rc2Var.getMessageObject().o == null)) {
                    Integer C1 = oc7.r1(this.b).C1(this.J, this.K);
                    if ((C1 == null || C1.intValue() != 5) && this.F == null && n) {
                        u31 u31Var = u31.x;
                        if ((u31Var == null || !u31Var.m) && gda.Z0 > 0 && z8c.h(this.b).e() != yv1Var.f.id) {
                            gda.Z0--;
                            a.b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", gda.Z0).apply();
                            if (rc2Var.getMessageObject().F2()) {
                                V = rc2Var.getMessageObject().F0();
                            } else {
                                V = hs6.d0(this.b).V(rc2Var.getMessageObject().V1());
                            }
                            o1b o1bVar = new o1b(yv1Var.getParentActivity(), null, 1, -1, V, yv1Var.getResourceProvider());
                            o1bVar.c.setVisibility(8);
                            o1bVar.b.setText(gw3.m(gm.S2(jb6.a0("EmojiInteractionTapHint", null, 2131751114, yv1Var.f.first_name)), o1bVar.b.getPaint().getFontMetricsInt(), false, null, 0));
                            o1bVar.b.setTypeface(null);
                            o1bVar.b.setMaxLines(3);
                            o1bVar.b.setSingleLine(false);
                            us4 us4Var = new us4(this, u31.g(yv1Var, o1bVar, 2750), false, (byte) 7);
                            this.F = us4Var;
                            gm.d3(us4Var, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                rc2Var.getMessageObject().R = false;
                rc2Var.getMessageObject().k.premiumEffectWasPlayed = true;
                yv1Var.getMessagesStorage().U1(this.J, rc2Var.getMessageObject().k);
            }
        }
    }

    public final void l(rc2 rc2Var) {
        ArrayList arrayList;
        k47 messageObject = rc2Var.getMessageObject();
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
            hs6.d0(this.b).m1(gn5.b(document), 2);
        }
    }

    public final boolean n(rc2 rc2Var, int i, boolean z, boolean z2) {
        if (rc2Var != null && this.G.size() <= 12) {
            k47 messageObject = rc2Var.getMessageObject();
            if (rc2Var.getEffect() != null || rc2Var.getPhotoImage().E()) {
                String V1 = messageObject.V1();
                if (V1 == null) {
                    V1 = messageObject.k.message;
                }
                if (rc2Var.getEffect() != null || V1 != null) {
                    float f = rc2Var.getPhotoImage().O0;
                    float f2 = rc2Var.getPhotoImage().N0;
                    if (rc2Var.getEffect() != null || (f > 0.0f && f2 > 0.0f)) {
                        return d(p(V1), rc2Var.getMessageObject().e1(), rc2Var.getMessageObject().F0(), messageObject, i, z, z2, f2, f, rc2Var.getMessageObject().O3());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, k47 k47Var) {
        yv1 yv1Var = this.a;
        if (yv1Var != null && !oc7.r1(this.b).H3() && yv1Var.getParentActivity() != null) {
            o1b o1bVar = new o1b(this.H.getContext(), null, 1, -1, k47Var.F0(), yv1Var.getResourceProvider());
            o1bVar.b.setText(tL_messages_stickerSet.set.title);
            o1bVar.c.setText(jb6.M0(2131746683, null));
            s31 s31Var = new s31(yv1Var.getResourceProvider(), yv1Var.getParentActivity(), true);
            o1bVar.setButton(s31Var);
            s31Var.b = new pv3(this, k47Var, (byte) 2);
            s31Var.e(jb6.M0(2131743247, null));
            u31 g = u31.g(yv1Var, o1bVar, 2750);
            g.b = k47Var.e1();
            g.j();
        }
    }

    public void g(jw3 jw3Var) {
    }

    public void h() {
    }

    public kw3(int i, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.b = i;
    }
}
