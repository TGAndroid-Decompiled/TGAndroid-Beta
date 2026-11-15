package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.b6;
import bi.y1;
import bi.z4;
import c8.ja;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.j6;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wi0;
public abstract class s extends FrameLayout implements is {
    public static final long[] L = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter M = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public TLRPC.TL_messages_stickerSet E;
    public boolean F;
    public boolean G;
    public final HashSet H;
    public final HashSet I;
    public ArrayList J;
    public boolean K;
    public final int f5475a;
    public final f0 f5476b;
    public final m f5477c;
    public final v4.s d;
    public final k f5478e;
    public final wi0 f5479f;
    public final r h;
    public final ArrayList f5480n;
    public int f5481r;
    public int f5482s;
    public boolean f5483w;
    public final boolean f5484x;
    public int f5485y;

    public s(Context context, int i7, f0 f0Var) {
        super(context);
        g0 g0Var = (g0) this;
        k kVar = new k(g0Var);
        this.f5478e = kVar;
        this.f5480n = new ArrayList();
        this.f5481r = 7;
        this.f5485y = -1711276033;
        this.H = new HashSet();
        this.I = new HashSet();
        this.f5475a = i7;
        this.f5476b = f0Var;
        this.f5484x = m10.i(i7).q();
        ?? uj0Var = new uj0(context, null);
        this.f5477c = uj0Var;
        v4.s sVar = new v4.s(this.f5481r);
        this.d = sVar;
        sVar.O = new y1(g0Var, 3);
        uj0Var.setLayoutManager(sVar);
        wi0 wi0Var = new wi0(uj0Var, sVar);
        this.f5479f = wi0Var;
        wi0Var.f41359i = new h(g0Var, 0);
        uj0Var.setAdapter(kVar);
        uj0Var.setSelectorDrawableColor(0);
        uj0Var.setOnItemClickListener(new b6(f0Var, 1));
        uj0Var.setItemAnimator(null);
        uj0Var.setOverScrollMode(2);
        uj0Var.setVerticalScrollBarEnabled(false);
        uj0Var.setClipToPadding(false);
        uj0Var.j(new z4(g0Var, 5));
        addView((View) uj0Var, ja.c(-1.0f, -1));
        r rVar = new r(g0Var, context);
        this.h = rVar;
        addView(rVar, ja.e(-1, 36, 48));
        e();
    }

    public static void b(Canvas canvas, Drawable drawable) {
        boolean d = d(drawable);
        if (d) {
            drawable.setColorFilter(M);
        }
        drawable.draw(canvas);
        if (d) {
            drawable.setColorFilter(null);
        }
    }

    public static boolean d(Drawable drawable) {
        if ((drawable instanceof g5) && gj.C4(((g5) drawable).f34804e)) {
            return true;
        }
        return false;
    }

    public final ArrayList a() {
        String[] split;
        if (this.J == null) {
            this.J = new ArrayList();
            for (String str : np.s1(this.f5475a).f25280f7.getString("qrAppliedEmoji", "").split(",")) {
                try {
                    if (!str.isEmpty()) {
                        this.J.add(Long.valueOf(Long.parseLong(str)));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return this.J;
    }

    public final int c() {
        int R;
        m mVar = this.f5477c;
        int paddingTop = mVar.getPaddingTop();
        int i7 = Integer.MAX_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < mVar.getChildCount(); i11++) {
            View childAt = mVar.getChildAt(i11);
            this.d.getClass();
            int z10 = v4.o0.z(childAt);
            if (z10 >= paddingTop && z10 < i7 && (R = RecyclerView.R(childAt)) != -1) {
                i10 = R;
                i7 = z10;
            }
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25600x0 && objArr.length > 0) {
            Object obj = objArr[0];
            if ((obj instanceof Integer) && ((Integer) obj).intValue() != 5) {
                return;
            }
        }
        e();
    }

    public final void e() {
        String str;
        String str2;
        long j3;
        long j10;
        long j11;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        String str3;
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        int i7;
        int i10;
        boolean z10;
        HashSet hashSet;
        TLRPC.Document document;
        String str4;
        HashSet hashSet2;
        ArrayList<TLRPC.Document> arrayList4;
        int i11 = this.f5475a;
        si b02 = si.b0(i11);
        ArrayList<o> arrayList5 = this.f5480n;
        arrayList5.clear();
        ArrayList arrayList6 = new ArrayList();
        ArrayList s02 = b02.s0(5);
        int size = s02.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i13 >= size) {
                break;
            }
            Object obj = s02.get(i13);
            i13++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null && tL_messages_stickerSet.documents != null) {
                ArrayList arrayList7 = new ArrayList();
                ArrayList<TLRPC.Document> arrayList8 = tL_messages_stickerSet.documents;
                int size2 = arrayList8.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.Document document2 = arrayList8.get(i14);
                    i14++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null && "application/x-tgsticker".equals(document3.mime_type)) {
                        arrayList7.add(document3);
                    }
                }
                if (!arrayList7.isEmpty()) {
                    arrayList6.add(new o(2, tL_messages_stickerSet.set.title, arrayList7));
                }
            }
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet l02 = si.b0(i11).l0(tL_inputStickerSetShortName, null, false, true, new ai.f0(this, 4));
            if (l02 != null && (arrayList4 = l02.documents) != null && !arrayList4.isEmpty()) {
                this.E = l02;
            }
        }
        ArrayList arrayList9 = new ArrayList(21);
        HashSet hashSet3 = this.I;
        hashSet3.clear();
        if (this.E == null && !this.G) {
            for (int i15 = 0; i15 < 21; i15++) {
                arrayList9.add(new TLRPC.TL_documentEmpty());
            }
            str2 = "application/x-tgsticker";
        } else {
            HashMap hashMap = new HashMap();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.E;
            if (tL_messages_stickerSet2 != null && (arrayList3 = tL_messages_stickerSet2.documents) != null) {
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    TLRPC.Document document4 = arrayList3.get(i16);
                    i16++;
                    TLRPC.Document document5 = document4;
                    String str5 = str;
                    if (document5 != null) {
                        hashMap.put(Long.valueOf(document5.f28057id), document5);
                    }
                    str = str5;
                }
            }
            str2 = str;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.E;
            if (tL_messages_stickerSet3 != null && (arrayList = tL_messages_stickerSet3.packs) != null) {
                int size4 = arrayList.size();
                int i17 = 0;
                while (i17 < size4) {
                    TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i17);
                    i17++;
                    TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                    j3 = 0;
                    if (tL_stickerPack2 != null && (str3 = tL_stickerPack2.emoticon) != null && str3.replace("️", "").equals("❄") && (arrayList2 = tL_stickerPack2.documents) != null && !arrayList2.isEmpty()) {
                        j10 = tL_stickerPack2.documents.get(0).longValue();
                        break;
                    }
                }
            }
            j3 = 0;
            j10 = 0;
            int i18 = 0;
            for (int i19 = 21; i18 < i19; i19 = 21) {
                if (i18 == 4 && j10 != j3 && hashMap.containsKey(Long.valueOf(j10))) {
                    j11 = j10;
                } else {
                    j11 = L[i18];
                }
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j11));
                if (document6 == null) {
                    document6 = g5.e(i11, j11);
                }
                if (document6 != null) {
                    arrayList9.add(document6);
                    hashSet3.add(Long.valueOf(document6.f28057id));
                } else if (this.H.add(Long.valueOf(j11))) {
                    g5.g(i11).b(j11, new d5() {
                        @Override
                        public final void a(TLRPC.Document document7) {
                            org.telegram.messenger.g0.h3(new c1.c(8, s.this, document7));
                        }
                    });
                }
                i18++;
            }
        }
        if (!arrayList9.isEmpty()) {
            arrayList5.add(new o(0, hd.M0(2131746497, null), arrayList9));
        }
        ArrayList arrayList10 = new ArrayList();
        HashSet hashSet4 = new HashSet();
        int i20 = this.f5481r * 3;
        ArrayList a10 = a();
        int i21 = 0;
        while (i21 < a10.size() && arrayList10.size() < i20) {
            long longValue = ((Long) a10.get(i21)).longValue();
            int size5 = arrayList9.size();
            int i22 = i12;
            while (true) {
                if (i22 < size5) {
                    Object obj2 = arrayList9.get(i22);
                    i22++;
                    document = (TLRPC.Document) obj2;
                    hashSet = hashSet4;
                    if (document.f28057id == longValue) {
                        break;
                    }
                    hashSet4 = hashSet;
                } else {
                    hashSet = hashSet4;
                    document = null;
                    break;
                }
            }
            if (document == null) {
                document = g5.e(i11, longValue);
            }
            if (document != null) {
                str4 = str2;
                if (str4.equals(document.mime_type)) {
                    hashSet2 = hashSet;
                    if (hashSet2.add(Long.valueOf(document.f28057id))) {
                        arrayList10.add(document);
                    }
                    i21++;
                    str2 = str4;
                    hashSet4 = hashSet2;
                    i12 = 0;
                }
            } else {
                str4 = str2;
            }
            hashSet2 = hashSet;
            i21++;
            str2 = str4;
            hashSet4 = hashSet2;
            i12 = 0;
        }
        HashSet hashSet5 = hashSet4;
        String str6 = str2;
        int i23 = 0;
        while (true) {
            ArrayList arrayList11 = j6.f24526i;
            if (i23 >= arrayList11.size() || arrayList10.size() >= i20) {
                break;
            }
            String str7 = (String) arrayList11.get(i23);
            if (str7 != null && str7.startsWith("animated_")) {
                try {
                    TLRPC.Document e10 = g5.e(i11, Long.parseLong(str7.substring(9)));
                    if (e10 != null && str6.equals(e10.mime_type)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && hashSet5.add(Long.valueOf(e10.f28057id))) {
                        arrayList10.add(e10);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i23++;
        }
        if (!arrayList10.isEmpty()) {
            i7 = 1;
            arrayList5.add(new o(1, hd.M0(2131746361, null), arrayList10));
        } else {
            i7 = 1;
        }
        arrayList5.addAll(arrayList6);
        int size6 = arrayList5.size();
        int i24 = 0;
        int i25 = 0;
        while (i25 < size6) {
            o oVar = arrayList5.get(i25);
            i25++;
            o oVar2 = oVar;
            oVar2.d = i24;
            if (oVar2.f5451b != null) {
                i10 = i7;
            } else {
                i10 = 0;
            }
            i24 += oVar2.f5452c.size() + i10;
        }
        this.f5482s = i24;
        this.f5478e.f();
        r rVar = this.h;
        rVar.setSections(arrayList5);
        rVar.a(f(c()), false);
    }

    public final int f(int i7) {
        ArrayList arrayList = this.f5480n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((o) arrayList.get(size)).d <= i7) {
                return size;
            }
        }
        return 0;
    }

    public m getGrid() {
        return this.f5477c;
    }

    public r getTabs() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f5475a;
        ns.f(i7).c(this, ns.f25600x0);
        ns.f(i7).c(this, ns.B0);
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f5475a;
        ns.f(i7).n(this, ns.f25600x0);
        ns.f(i7).n(this, ns.B0);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        m mVar = this.f5477c;
        int max = Math.max(5, ((i7 - mVar.getPaddingLeft()) - mVar.getPaddingRight()) / org.telegram.messenger.g0.L(46.0f));
        if (max != this.f5481r) {
            this.f5481r = max;
            this.d.y1(max);
            post(new ch.w(this, 1));
        }
    }

    public void setHeaderColor(int i7) {
        if (this.f5485y != i7) {
            this.f5485y = i7;
            int i10 = 0;
            while (true) {
                m mVar = this.f5477c;
                if (i10 < mVar.getChildCount()) {
                    View childAt = mVar.getChildAt(i10);
                    if (childAt instanceof n) {
                        ((n) childAt).f5436a.setTextColor(i7);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }
}
