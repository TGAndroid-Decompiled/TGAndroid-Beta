package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.h8;
import bi.q1;
import bi.s2;
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.o5;
public abstract class s extends FrameLayout implements fs {
    public static final long[] L = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter M = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public TLRPC.TL_messages_stickerSet E;
    public boolean F;
    public boolean G;
    public final HashSet H;
    public final HashSet I;
    public ArrayList J;
    public boolean K;
    public final int f5757a;
    public final g0 f5758b;
    public final m f5759c;
    public final v4.t d;
    public final k f5760e;
    public final l5 f5761f;
    public final r h;
    public final ArrayList f5762n;
    public int f5763r;
    public int f5764s;
    public boolean f5765w;
    public final boolean f5766x;
    public int f5767y;

    public s(Context context, int i7, g0 g0Var) {
        super(context);
        h0 h0Var = (h0) this;
        k kVar = new k(h0Var);
        this.f5760e = kVar;
        this.f5762n = new ArrayList();
        this.f5763r = 7;
        this.f5767y = -1711276033;
        this.H = new HashSet();
        this.I = new HashSet();
        this.f5757a = i7;
        this.f5758b = g0Var;
        this.f5766x = j10.i(i7).q();
        ?? ck0Var = new ck0(context, null);
        this.f5759c = ck0Var;
        v4.t tVar = new v4.t(this.f5763r);
        this.d = tVar;
        tVar.O = new s2(h0Var, 3);
        ck0Var.setLayoutManager(tVar);
        l5 l5Var = new l5(ck0Var, tVar);
        this.f5761f = l5Var;
        l5Var.f29204r = new h(h0Var, 0);
        ck0Var.setAdapter(kVar);
        ck0Var.setSelectorDrawableColor(0);
        ck0Var.setOnItemClickListener(new h8(g0Var, 1));
        ck0Var.setItemAnimator(null);
        ck0Var.setOverScrollMode(2);
        ck0Var.setVerticalScrollBarEnabled(false);
        ck0Var.setClipToPadding(false);
        ck0Var.j(new q1(h0Var, 6));
        addView((View) ck0Var, ma.c(-1.0f, -1));
        r rVar = new r(h0Var, context);
        this.h = rVar;
        addView(rVar, ma.e(-1, 36, 48));
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
        if ((drawable instanceof o5) && fj.C4(((o5) drawable).f37971e)) {
            return true;
        }
        return false;
    }

    public final ArrayList a() {
        String[] split;
        if (this.J == null) {
            this.J = new ArrayList();
            for (String str : mp.u1(this.f5757a).h7.getString("qrAppliedEmoji", "").split(",")) {
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
        m mVar = this.f5759c;
        int paddingTop = mVar.getPaddingTop();
        int i7 = Integer.MAX_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < mVar.getChildCount(); i11++) {
            View childAt = mVar.getChildAt(i11);
            this.d.getClass();
            int z10 = v4.p0.z(childAt);
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
        if (i7 == ks.f25218x0 && objArr.length > 0) {
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
        ArrayList arrayList4;
        int i11;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList5;
        int i12 = this.f5757a;
        ri d02 = ri.d0(i12);
        ArrayList<o> arrayList6 = this.f5762n;
        arrayList6.clear();
        ArrayList arrayList7 = new ArrayList();
        ArrayList u02 = d02.u0(5);
        int size = u02.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i14 >= size) {
                break;
            }
            Object obj = u02.get(i14);
            i14++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null && tL_messages_stickerSet.documents != null) {
                ArrayList arrayList8 = new ArrayList();
                ArrayList<TLRPC.Document> arrayList9 = tL_messages_stickerSet.documents;
                int size2 = arrayList9.size();
                int i15 = 0;
                while (i15 < size2) {
                    TLRPC.Document document2 = arrayList9.get(i15);
                    i15++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null && "application/x-tgsticker".equals(document3.mime_type)) {
                        arrayList8.add(document3);
                    }
                }
                if (!arrayList8.isEmpty()) {
                    arrayList7.add(new o(2, tL_messages_stickerSet.set.title, arrayList8));
                }
            }
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet n02 = ri.d0(i12).n0(tL_inputStickerSetShortName, null, false, true, new ai.g0(this, 6));
            if (n02 != null && (arrayList5 = n02.documents) != null && !arrayList5.isEmpty()) {
                this.E = n02;
            }
        }
        ArrayList arrayList10 = new ArrayList(21);
        HashSet hashSet = this.I;
        hashSet.clear();
        if (this.E == null && !this.G) {
            for (int i16 = 0; i16 < 21; i16++) {
                arrayList10.add(new TLRPC.TL_documentEmpty());
            }
            str2 = "application/x-tgsticker";
        } else {
            HashMap hashMap = new HashMap();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.E;
            if (tL_messages_stickerSet2 != null && (arrayList3 = tL_messages_stickerSet2.documents) != null) {
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    TLRPC.Document document4 = arrayList3.get(i17);
                    i17++;
                    TLRPC.Document document5 = document4;
                    String str4 = str;
                    if (document5 != null) {
                        hashMap.put(Long.valueOf(document5.f28409id), document5);
                    }
                    str = str4;
                }
            }
            str2 = str;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.E;
            if (tL_messages_stickerSet3 != null && (arrayList = tL_messages_stickerSet3.packs) != null) {
                int size4 = arrayList.size();
                int i18 = 0;
                while (i18 < size4) {
                    TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i18);
                    i18++;
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
            for (int i19 = 0; i19 < 21; i19++) {
                if (i19 == 4 && j10 != j3 && hashMap.containsKey(Long.valueOf(j10))) {
                    j11 = j10;
                } else {
                    j11 = L[i19];
                }
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j11));
                if (document6 == null) {
                    document6 = o5.e(i12, j11);
                }
                if (document6 != null) {
                    arrayList10.add(document6);
                    hashSet.add(Long.valueOf(document6.f28409id));
                } else if (this.H.add(Long.valueOf(j11))) {
                    o5.g(i12).b(j11, new org.telegram.ui.Components.l5() {
                        @Override
                        public final void a(TLRPC.Document document7) {
                            org.telegram.messenger.g0.g3(new c1.c(7, s.this, document7));
                        }
                    });
                }
            }
        }
        if (!arrayList10.isEmpty()) {
            arrayList6.add(new o(0, gd.M0(2131746302, null), arrayList10));
        }
        ArrayList arrayList11 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        int i20 = this.f5763r * 3;
        ArrayList a10 = a();
        int i21 = 0;
        while (i21 < a10.size() && arrayList11.size() < i20) {
            long longValue = ((Long) a10.get(i21)).longValue();
            int size5 = arrayList10.size();
            while (true) {
                if (i13 < size5) {
                    Object obj2 = arrayList10.get(i13);
                    i13++;
                    document = (TLRPC.Document) obj2;
                    arrayList4 = a10;
                    i11 = i21;
                    if (document.f28409id == longValue) {
                        break;
                    }
                    a10 = arrayList4;
                    i21 = i11;
                } else {
                    arrayList4 = a10;
                    i11 = i21;
                    document = null;
                    break;
                }
            }
            if (document == null) {
                document = o5.e(i12, longValue);
            }
            if (document != null && str2.equals(document.mime_type) && hashSet2.add(Long.valueOf(document.f28409id))) {
                arrayList11.add(document);
            }
            i21 = i11 + 1;
            a10 = arrayList4;
            i13 = 0;
        }
        int i22 = 0;
        while (true) {
            ArrayList arrayList12 = j6.f24816i;
            if (i22 >= arrayList12.size() || arrayList11.size() >= i20) {
                break;
            }
            String str5 = (String) arrayList12.get(i22);
            if (str5 != null && str5.startsWith("animated_")) {
                try {
                    TLRPC.Document e10 = o5.e(i12, Long.parseLong(str5.substring(9)));
                    if (e10 != null && str2.equals(e10.mime_type)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && hashSet2.add(Long.valueOf(e10.f28409id))) {
                        arrayList11.add(e10);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i22++;
        }
        if (!arrayList11.isEmpty()) {
            i7 = 1;
            arrayList6.add(new o(1, gd.M0(2131746166, null), arrayList11));
        } else {
            i7 = 1;
        }
        arrayList6.addAll(arrayList7);
        int size6 = arrayList6.size();
        int i23 = 0;
        int i24 = 0;
        while (i24 < size6) {
            o oVar = arrayList6.get(i24);
            i24++;
            o oVar2 = oVar;
            oVar2.d = i23;
            if (oVar2.f5726b != null) {
                i10 = i7;
            } else {
                i10 = 0;
            }
            i23 += oVar2.f5727c.size() + i10;
        }
        this.f5764s = i23;
        this.f5760e.f();
        r rVar = this.h;
        rVar.setSections(arrayList6);
        rVar.a(f(c()), false);
    }

    public final int f(int i7) {
        ArrayList arrayList = this.f5762n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((o) arrayList.get(size)).d <= i7) {
                return size;
            }
        }
        return 0;
    }

    public m getGrid() {
        return this.f5759c;
    }

    public r getTabs() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f5757a;
        ks.f(i7).c(this, ks.f25218x0);
        ks.f(i7).c(this, ks.B0);
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f5757a;
        ks.f(i7).n(this, ks.f25218x0);
        ks.f(i7).n(this, ks.B0);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        m mVar = this.f5759c;
        int max = Math.max(5, ((i7 - mVar.getPaddingLeft()) - mVar.getPaddingRight()) / org.telegram.messenger.g0.L(46.0f));
        if (max != this.f5763r) {
            this.f5763r = max;
            this.d.y1(max);
            post(new ca.r(this, 5));
        }
    }

    public void setHeaderColor(int i7) {
        if (this.f5767y != i7) {
            this.f5767y = i7;
            int i10 = 0;
            while (true) {
                m mVar = this.f5759c;
                if (i10 < mVar.getChildCount()) {
                    View childAt = mVar.getChildAt(i10);
                    if (childAt instanceof n) {
                        ((n) childAt).f5720a.setTextColor(i7);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }
}
