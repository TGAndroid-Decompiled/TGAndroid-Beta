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
public class tv3 implements fn7 {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public zg3 E;
    public xs4 F;
    public final FrameLayout H;
    public final wq1 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final zu1 a;
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

    public tv3(zu1 zu1Var, FrameLayout frameLayout, wq1 wq1Var, int i, long j, long j2) {
        this.a = zu1Var;
        this.H = frameLayout;
        this.I = wq1Var;
        this.b = i;
        this.J = j;
        this.K = j2;
    }

    public static boolean a(wb2 wb2Var, float f, int i) {
        float s = wb2Var.getPhotoImage().s() + wb2Var.getY();
        if (s > f && s < i) {
            return true;
        }
        return false;
    }

    public static int f() {
        float min;
        float f;
        if (hl.O1()) {
            min = hl.P0();
            f = 0.4f;
        } else {
            Point point = hl.q;
            min = Math.min(point.x, point.y);
            f = 0.5f;
        }
        return (int) ((((int) (min * f)) * 2.0f) / hl.p);
    }

    public static java.lang.String p(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv3.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet q0 = ls6.d0(this.b).q0("EmojiAnimations");
            this.c = q0;
            if (q0 == null) {
                q0 = ls6.d0(this.b).o0("EmojiAnimations");
                this.c = q0;
            }
            if (q0 == null) {
                ls6.d0(this.b).d1("EmojiAnimations", false, true);
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
                ((sv3) arrayList.get(i)).r.K();
                if (((sv3) arrayList.get(i)).j != null) {
                    ((sv3) arrayList.get(i)).j.d(this.H);
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i, TLRPC.Document document, r47 r47Var, int i2, boolean z, boolean z2, float f, float f2, boolean z3) {
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
        zg3 zg3Var;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i3 = i2;
        if (r47Var != null && r47Var.V3()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (r47Var != null && r47Var.M0() != null) {
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
                        if (((sv3) arrayList2.get(i4)).p == i) {
                            i5++;
                            if (!z5 && (((sv3) arrayList2.get(i4)).r.y() == null || ((sv3) arrayList2.get(i4)).r.y().t())) {
                                return false;
                            }
                        }
                        if (((sv3) arrayList2.get(i4)).q != null && document != null && ((sv3) arrayList2.get(i4)).q.id == document.id) {
                            i6++;
                        }
                        i4++;
                    } else if (z && z4 && i5 > 0) {
                        v21 v21Var = v21.x;
                        if (v21Var != null && v21Var.b == r47Var.e1()) {
                            return false;
                        }
                        TLRPC.InputStickerSet j1 = r47.j1(r47Var.k);
                        if (j1.short_name != null) {
                            tL_messages_stickerSet = ls6.d0(this.b).q0(j1.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = ls6.d0(this.b).p0(j1.id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = j1;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new ql(this, r47Var, (byte) 29));
                            return false;
                        }
                        o(tL_messages_stickerSet, r47Var);
                        return false;
                    } else if (i5 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z5) {
                            TLRPC.TL_availableEffect M0 = r47Var.M0();
                            TLRPC.messages_AvailableEffects E0 = uc7.s1(this.b).E0();
                            if (E0 == null) {
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
                                if (i7 < E0.documents.size()) {
                                    document2 = E0.documents.get(i7);
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
                                F1 = r47.F1(document2);
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
                                document2 = r47Var.F0();
                                F1 = r47.F1(r47Var.F0());
                            } else {
                                if (r47Var != null && r47Var.F2()) {
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
                        sv3 sv3Var = new sv3();
                        sv3Var.h = z4;
                        sv3Var.i = z5;
                        if (!z5) {
                            sv3Var.f = ((random.nextInt() % 101) / 100.0f) * (f / 4.0f);
                            sv3Var.g = ((random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                        }
                        sv3Var.p = i;
                        sv3Var.q = document2;
                        sv3Var.m = z3;
                        ImageReceiver imageReceiver = sv3Var.r;
                        imageReceiver.u0 = true;
                        imageReceiver.t0 = z;
                        if (xea.o() > 1) {
                            boolean z7 = f11.a;
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
                            jn5 b = jn5.b(document2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(i10);
                            sb.append("_");
                            imageReceiver.w1 = uh9.l(sb, sv3Var.p, "_");
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
                            sv3Var.r.d0(b, sb2.toString(), null, "tgs", this.c, 1);
                            imageReceiver.h1 = new rv3(this, sv3Var, z, r47Var);
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
                                imageReceiver.w1 = uh9.l(sb3, sv3Var.p, "_");
                            }
                            sv3Var.q = document2;
                            jn5 d = jn5.d(F1, document2);
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
                            sv3Var.r.d0(d, sb4.toString(), null, "tgs", this.c, 1);
                        }
                        imageReceiver.m0(Integer.MAX_VALUE);
                        imageReceiver.M(0);
                        if (imageReceiver.y() != null) {
                            if (sv3Var.h) {
                                imageReceiver.y().I(0, false, true);
                            }
                            imageReceiver.y().start();
                        }
                        arrayList2.add(sv3Var);
                        imageReceiver.I();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.p0(frameLayout);
                        frameLayout.invalidate();
                        if (z && !z8 && yac.h(this.b).n != this.J) {
                            int i11 = this.r;
                            if (i11 != 0 && i11 != i && (zg3Var = this.E) != null) {
                                hl.r(zg3Var);
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
                            zg3 zg3Var2 = this.E;
                            if (zg3Var2 != null) {
                                hl.r(zg3Var2);
                                this.E = null;
                            }
                            zg3 zg3Var3 = new zg3(this, (byte) 27);
                            this.E = zg3Var3;
                            hl.d3(zg3Var3, 500L);
                        }
                        if (z2) {
                            uc7.s1(this.b).P4(11, 0, this.J, this.K, str);
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
        Integer D1;
        if (i == jn7.y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i3 = jn7.W4;
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
                                hl.d3(new qv3(this, i4, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i == 2 && (D1 = uc7.s1(this.b).D1(j, this.K)) != null && D1.intValue() == 5) {
            xs4 xs4Var = this.F;
            if (xs4Var != null) {
                hl.r(xs4Var);
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
        r47 r47Var;
        float f4;
        if (!this.G.isEmpty()) {
            int i = 0;
            while (true) {
                int size = this.G.size();
                arrayList = this.G;
                if (i >= size) {
                    break;
                }
                sv3 sv3Var = (sv3) arrayList.get(i);
                if (this.a != null) {
                    sv3Var.c = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.I.getChildCount()) {
                            View childAt = this.I.getChildAt(i2);
                            if (childAt instanceof wb2) {
                                wb2 wb2Var = (wb2) childAt;
                                r47Var = wb2Var.getMessageObject();
                                imageReceiver = wb2Var.getPhotoImage();
                            } else if (childAt instanceof dl1) {
                                dl1 dl1Var = (dl1) childAt;
                                r47Var = dl1Var.getMessageObject();
                                imageReceiver = dl1Var.getPhotoImage();
                            } else {
                                imageReceiver = null;
                                r47Var = null;
                            }
                            if (r47Var != null && r47Var.e1() == sv3Var.p) {
                                sv3Var.c = true;
                                float x = childAt.getX() + this.I.getX();
                                float y = childAt.getY() + this.I.getY();
                                f3 = childAt.getY();
                                f = 3.0f;
                                float f5 = imageReceiver.N0;
                                sv3Var.d = f5;
                                f2 = 2.0f;
                                sv3Var.e = imageReceiver.O0;
                                if (sv3Var.i && (childAt instanceof wb2)) {
                                    wb2 wb2Var2 = (wb2) childAt;
                                    float f6 = (f() * hl.p) / 1.3f;
                                    float f7 = f6 / 3.0f;
                                    sv3Var.d = f7;
                                    sv3Var.e = f7;
                                    float f8 = f6 / 2.0f;
                                    sv3Var.a = Utilities.i((wb2Var2.getTimeX() + x) - f8, hl.q.x - f6, 0.0f);
                                    sv3Var.b = (wb2Var2.getTimeY() + y) - f8;
                                } else {
                                    boolean z5 = sv3Var.h;
                                    float f9 = x + imageReceiver.L0;
                                    if (z5) {
                                        sv3Var.a = f9;
                                        sv3Var.b = y + imageReceiver.M0;
                                    } else {
                                        float f10 = y + imageReceiver.M0;
                                        if (sv3Var.m) {
                                            f4 = ((-f5) * 2.0f) + hl.L(24.0f) + f9;
                                        } else {
                                            f4 = (-hl.L(24.0f)) + f9;
                                        }
                                        sv3Var.a = f4;
                                        sv3Var.b = f10 - imageReceiver.N0;
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
                    if (!sv3Var.c || sv3Var.e + f3 < this.a.P9 || f3 > this.I.getMeasuredHeight() - this.a.Ya) {
                        sv3Var.n = true;
                    }
                    if (sv3Var.h) {
                        float f11 = sv3Var.e / f2;
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
                            sv3Var.n = true;
                        }
                    }
                    if (sv3Var.n) {
                        float f12 = sv3Var.o;
                        if (f12 != 1.0f) {
                            float i3 = Utilities.i(f12 + 0.10666667f, 1.0f, 0.0f);
                            sv3Var.o = i3;
                            sv3Var.r.setAlpha(1.0f - i3);
                            this.a.m1.invalidate();
                        }
                    }
                } else {
                    f = 3.0f;
                    f2 = 2.0f;
                    g(sv3Var);
                }
                if (!sv3Var.l && sv3Var.n) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (sv3Var.h && !sv3Var.i) {
                        float f13 = sv3Var.e;
                        float f14 = 1.49926f * f13;
                        float f15 = 0.0546875f * f14;
                        float f16 = (((f13 / f2) + sv3Var.b) - (f14 / f2)) - (0.00279f * f14);
                        boolean z6 = sv3Var.m;
                        ImageReceiver imageReceiver2 = sv3Var.r;
                        float f17 = sv3Var.a;
                        if (!z6) {
                            imageReceiver2.i0(f17 - f15, f16, f14, f14);
                        } else {
                            imageReceiver2.i0(((f17 + sv3Var.d) - f14) + f15, f16, f14, f14);
                        }
                        if (!sv3Var.m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, sv3Var.r.r(), sv3Var.r.s());
                            sv3Var.r.h(canvas, null);
                            canvas.restore();
                        } else {
                            sv3Var.r.h(canvas, null);
                        }
                    } else {
                        yl ylVar = sv3Var.j;
                        if (ylVar != null) {
                            float f18 = sv3Var.a + sv3Var.f;
                            float f19 = sv3Var.b + sv3Var.g;
                            float f20 = sv3Var.d * f;
                            ylVar.e((int) f18, (int) f19, (int) (f18 + f20), (int) (f19 + f20));
                            sv3Var.j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver3 = sv3Var.r;
                            float f21 = sv3Var.a + sv3Var.f;
                            float f22 = sv3Var.b + sv3Var.g;
                            float f23 = sv3Var.d * f;
                            imageReceiver3.i0(f21, f22, f23, f23);
                            if (!sv3Var.m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, sv3Var.r.r(), sv3Var.r.s());
                                sv3Var.r.h(canvas, null);
                                canvas.restore();
                            } else {
                                sv3Var.r.h(canvas, null);
                            }
                        }
                    }
                }
                yl ylVar2 = sv3Var.j;
                if (ylVar2 != null) {
                    z2 = ylVar2.c();
                } else if (sv3Var.l && sv3Var.r.y() != null && sv3Var.r.y().b0 >= sv3Var.r.y().e[0] - 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (sv3Var.o != 1.0f && !z2 && !z) {
                    if (sv3Var.r.y() != null && sv3Var.r.y().l0) {
                        sv3Var.l = true;
                    } else if (sv3Var.r.y() != null && !sv3Var.r.y().l0) {
                        sv3Var.r.y().I(0, true, false);
                        sv3Var.r.y().start();
                    }
                } else {
                    sv3 sv3Var2 = (sv3) this.G.remove(i);
                    if (sv3Var.h && sv3Var.r.y() != null) {
                        sv3Var2.r.y().I(0, true, true);
                    }
                    sv3Var2.r.K();
                    yl ylVar3 = sv3Var2.j;
                    if (ylVar3 != null) {
                        ylVar3.d(this.H);
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
        jn7.f(this.b).b(this, jn7.y0);
        jn7.f(this.b).b(this, jn7.W4);
        jn7.f(this.b).b(this, 2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i < arrayList.size()) {
                ((sv3) arrayList.get(i)).r.I();
                if (((sv3) arrayList.get(i)).j != null) {
                    ((sv3) arrayList.get(i)).j.f(this.H);
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
        jn7.f(this.b).n(this, jn7.y0);
        jn7.f(this.b).n(this, jn7.W4);
        jn7.f(this.b).n(this, 2);
        while (true) {
            ArrayList arrayList = this.G;
            if (i < arrayList.size()) {
                ((sv3) arrayList.get(i)).r.K();
                if (((sv3) arrayList.get(i)).j != null) {
                    ((sv3) arrayList.get(i)).j.d(this.H);
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(wb2 wb2Var, zu1 zu1Var, boolean z) {
        TLRPC.Document V;
        if (!zu1Var.y() && wb2Var.getMessageObject() != null && wb2Var.getMessageObject().e1() >= 0) {
            if (wb2Var.getMessageObject().V3() || zu1Var.f != null) {
                boolean n = n(wb2Var, -1, z, false);
                if (z && n) {
                    String V1 = wb2Var.getMessageObject().V1();
                    if (!jx3.a(V1) && !"🍑".equals(V1) && !"⚰".equals(V1) && !wb2Var.getMessageObject().V3() && !wb2Var.getMessageObject().F2()) {
                        try {
                            wb2Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!wb2Var.getMessageObject().V3() && wb2Var.getEffect() == null && (z || wb2Var.getMessageObject().o == null)) {
                    Integer D1 = uc7.s1(this.b).D1(this.J, this.K);
                    if ((D1 == null || D1.intValue() != 5) && this.F == null && n) {
                        v21 v21Var = v21.x;
                        if ((v21Var == null || !v21Var.m) && xea.Z0 > 0 && yac.h(this.b).e() != zu1Var.f.id) {
                            xea.Z0--;
                            a.b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", xea.Z0).apply();
                            if (wb2Var.getMessageObject().F2()) {
                                V = wb2Var.getMessageObject().F0();
                            } else {
                                V = ls6.d0(this.b).V(wb2Var.getMessageObject().V1());
                            }
                            l3b l3bVar = new l3b(zu1Var.getParentActivity(), null, 1, -1, V, zu1Var.getResourceProvider());
                            l3bVar.c.setVisibility(8);
                            l3bVar.b.setText(pv3.m(hl.S2(ob6.a0("EmojiInteractionTapHint", null, 2131751142, zu1Var.f.first_name)), l3bVar.b.getPaint().getFontMetricsInt(), false, null, 0));
                            l3bVar.b.setTypeface(null);
                            l3bVar.b.setMaxLines(3);
                            l3bVar.b.setSingleLine(false);
                            xs4 xs4Var = new xs4(this, v21.g(zu1Var, l3bVar, 2750), false, (byte) 7);
                            this.F = xs4Var;
                            hl.d3(xs4Var, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                wb2Var.getMessageObject().R = false;
                wb2Var.getMessageObject().k.premiumEffectWasPlayed = true;
                zu1Var.getMessagesStorage().Z1(this.J, wb2Var.getMessageObject().k);
            }
        }
    }

    public final void l(wb2 wb2Var) {
        ArrayList arrayList;
        r47 messageObject = wb2Var.getMessageObject();
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
            ls6.d0(this.b).m1(jn5.b(document), 2);
        }
    }

    public final boolean n(wb2 wb2Var, int i, boolean z, boolean z2) {
        if (wb2Var != null && this.G.size() <= 12) {
            r47 messageObject = wb2Var.getMessageObject();
            if (wb2Var.getEffect() != null || wb2Var.getPhotoImage().E()) {
                String V1 = messageObject.V1();
                if (V1 == null) {
                    V1 = messageObject.k.message;
                }
                if (wb2Var.getEffect() != null || V1 != null) {
                    float f = wb2Var.getPhotoImage().O0;
                    float f2 = wb2Var.getPhotoImage().N0;
                    if (wb2Var.getEffect() != null || (f > 0.0f && f2 > 0.0f)) {
                        return d(p(V1), wb2Var.getMessageObject().e1(), wb2Var.getMessageObject().F0(), messageObject, i, z, z2, f2, f, wb2Var.getMessageObject().O3());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, r47 r47Var) {
        zu1 zu1Var = this.a;
        if (zu1Var != null && !uc7.s1(this.b).M3() && zu1Var.getParentActivity() != null) {
            l3b l3bVar = new l3b(this.H.getContext(), null, 1, -1, r47Var.F0(), zu1Var.getResourceProvider());
            l3bVar.b.setText(tL_messages_stickerSet.set.title);
            l3bVar.c.setText(ob6.M0(2131746677, null));
            t21 t21Var = new t21(zu1Var.getResourceProvider(), zu1Var.getParentActivity(), true);
            l3bVar.setButton(t21Var);
            t21Var.b = new wd3(this, r47Var, (byte) 28);
            t21Var.e(ob6.M0(2131743215, null));
            v21 g = v21.g(zu1Var, l3bVar, 2750);
            g.b = r47Var.e1();
            g.j();
        }
    }

    public void h() {
    }

    public void g(sv3 sv3Var) {
    }

    public tv3(int i, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.b = i;
    }
}
