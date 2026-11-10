package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ri0;
public abstract class x extends FrameLayout implements ls {
    public static final long[] K = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter L = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public TLRPC.TL_messages_stickerSet D;
    public boolean E;
    public boolean F;
    public final HashSet G;
    public final HashSet H;
    public ArrayList I;
    public boolean J;
    public final int f1671a;
    public final p0 f1672b;
    public final r f1673c;
    public final v4.s d;
    public final p f1674e;
    public final ri0 f1675f;
    public final w h;
    public final ArrayList f1676n;
    public int f1677r;
    public int f1678s;
    public boolean f1679w;
    public final boolean f1680x;
    public int f1681y;

    public x(Context context, int i7, p0 p0Var) {
        super(context);
        q0 q0Var = (q0) this;
        p pVar = new p(q0Var);
        this.f1674e = pVar;
        this.f1676n = new ArrayList();
        this.f1677r = 7;
        this.f1681y = -1711276033;
        this.G = new HashSet();
        this.H = new HashSet();
        this.f1671a = i7;
        this.f1672b = p0Var;
        this.f1680x = p10.i(i7).q();
        ?? pj0Var = new pj0(context, null);
        this.f1673c = pj0Var;
        v4.s sVar = new v4.s(this.f1677r);
        this.d = sVar;
        sVar.O = new l(q0Var, 0);
        pj0Var.setLayoutManager(sVar);
        ri0 ri0Var = new ri0(pj0Var, sVar);
        this.f1675f = ri0Var;
        ri0Var.f37671i = new m(q0Var, 0);
        pj0Var.setAdapter(pVar);
        pj0Var.setSelectorDrawableColor(0);
        pj0Var.setOnItemClickListener(new k(p0Var, 0));
        pj0Var.setItemAnimator(null);
        pj0Var.setOverScrollMode(2);
        pj0Var.setVerticalScrollBarEnabled(false);
        pj0Var.setClipToPadding(false);
        pj0Var.j(new b(q0Var, 1));
        addView((View) pj0Var, ha.c(-1.0f, -1));
        w wVar = new w(q0Var, context);
        this.h = wVar;
        addView(wVar, ha.e(-1, 36, 48));
        e();
    }

    public static void b(Canvas canvas, Drawable drawable) {
        boolean d = d(drawable);
        if (d) {
            drawable.setColorFilter(L);
        }
        drawable.draw(canvas);
        if (d) {
            drawable.setColorFilter(null);
        }
    }

    public static boolean d(Drawable drawable) {
        if ((drawable instanceof h5) && ij.C4(((h5) drawable).f34171e)) {
            return true;
        }
        return false;
    }

    public final ArrayList a() {
        String[] split;
        if (this.I == null) {
            this.I = new ArrayList();
            for (String str : qp.s1(this.f1671a).f24778e7.getString("qrAppliedEmoji", "").split(",")) {
                try {
                    if (!str.isEmpty()) {
                        this.I.add(Long.valueOf(Long.parseLong(str)));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return this.I;
    }

    public final int c() {
        int R;
        r rVar = this.f1673c;
        int paddingTop = rVar.getPaddingTop();
        int i7 = Integer.MAX_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < rVar.getChildCount(); i11++) {
            View childAt = rVar.getChildAt(i11);
            this.d.getClass();
            int z9 = v4.n0.z(childAt);
            if (z9 >= paddingTop && z9 < i7 && (R = RecyclerView.R(childAt)) != -1) {
                i10 = R;
                i7 = z9;
            }
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25108x0 && objArr.length > 0) {
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
        boolean z9;
        ArrayList arrayList4;
        int i11;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList5;
        int i12 = this.f1671a;
        ui b02 = ui.b0(i12);
        ArrayList<t> arrayList6 = this.f1676n;
        arrayList6.clear();
        ArrayList arrayList7 = new ArrayList();
        ArrayList s02 = b02.s0(5);
        int size = s02.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i14 >= size) {
                break;
            }
            Object obj = s02.get(i14);
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
                    arrayList7.add(new t(2, tL_messages_stickerSet.set.title, arrayList8));
                }
            }
        }
        if (this.D == null && !this.E) {
            this.E = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet l02 = ui.b0(i12).l0(tL_inputStickerSetShortName, null, false, true, new i(this, 0));
            if (l02 != null && (arrayList5 = l02.documents) != null && !arrayList5.isEmpty()) {
                this.D = l02;
            }
        }
        ArrayList arrayList10 = new ArrayList(21);
        HashSet hashSet = this.H;
        hashSet.clear();
        if (this.D == null && !this.F) {
            for (int i16 = 0; i16 < 21; i16++) {
                arrayList10.add(new TLRPC.TL_documentEmpty());
            }
            str2 = "application/x-tgsticker";
        } else {
            HashMap hashMap = new HashMap();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.D;
            if (tL_messages_stickerSet2 != null && (arrayList3 = tL_messages_stickerSet2.documents) != null) {
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    TLRPC.Document document4 = arrayList3.get(i17);
                    i17++;
                    TLRPC.Document document5 = document4;
                    String str4 = str;
                    if (document5 != null) {
                        hashMap.put(Long.valueOf(document5.f26966id), document5);
                    }
                    str = str4;
                }
            }
            str2 = str;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.D;
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
                    j11 = K[i19];
                }
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j11));
                if (document6 == null) {
                    document6 = h5.e(i12, j11);
                }
                if (document6 != null) {
                    arrayList10.add(document6);
                    hashSet.add(Long.valueOf(document6.f26966id));
                } else if (this.G.add(Long.valueOf(j11))) {
                    h5.g(i12).b(j11, new e5() {
                        @Override
                        public final void a(TLRPC.Document document7) {
                            org.telegram.messenger.g0.h3(new a1.e(8, x.this, document7));
                        }
                    });
                }
            }
        }
        if (!arrayList10.isEmpty()) {
            arrayList6.add(new t(0, id.M0(2131746497, null), arrayList10));
        }
        ArrayList arrayList11 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        int i20 = this.f1677r * 3;
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
                    if (document.f26966id == longValue) {
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
                document = h5.e(i12, longValue);
            }
            if (document != null && str2.equals(document.mime_type) && hashSet2.add(Long.valueOf(document.f26966id))) {
                arrayList11.add(document);
            }
            i21 = i11 + 1;
            a10 = arrayList4;
            i13 = 0;
        }
        int i22 = 0;
        while (true) {
            ArrayList arrayList12 = i6.f23062i;
            if (i22 >= arrayList12.size() || arrayList11.size() >= i20) {
                break;
            }
            String str5 = (String) arrayList12.get(i22);
            if (str5 != null && str5.startsWith("animated_")) {
                try {
                    TLRPC.Document e10 = h5.e(i12, Long.parseLong(str5.substring(9)));
                    if (e10 != null && str2.equals(e10.mime_type)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 && hashSet2.add(Long.valueOf(e10.f26966id))) {
                        arrayList11.add(e10);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i22++;
        }
        if (!arrayList11.isEmpty()) {
            i7 = 1;
            arrayList6.add(new t(1, id.M0(2131746361, null), arrayList11));
        } else {
            i7 = 1;
        }
        arrayList6.addAll(arrayList7);
        int size6 = arrayList6.size();
        int i23 = 0;
        int i24 = 0;
        while (i24 < size6) {
            t tVar = arrayList6.get(i24);
            i24++;
            t tVar2 = tVar;
            tVar2.d = i23;
            if (tVar2.f1642b != null) {
                i10 = i7;
            } else {
                i10 = 0;
            }
            i23 += tVar2.f1643c.size() + i10;
        }
        this.f1678s = i23;
        this.f1674e.f();
        w wVar = this.h;
        wVar.setSections(arrayList6);
        wVar.a(f(c()), false);
    }

    public final int f(int i7) {
        ArrayList arrayList = this.f1676n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((t) arrayList.get(size)).d <= i7) {
                return size;
            }
        }
        return 0;
    }

    public r getGrid() {
        return this.f1673c;
    }

    public w getTabs() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f1671a;
        qs.f(i7).c(this, qs.f25108x0);
        qs.f(i7).c(this, qs.B0);
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f1671a;
        qs.f(i7).n(this, qs.f25108x0);
        qs.f(i7).n(this, qs.B0);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        r rVar = this.f1673c;
        int max = Math.max(5, ((i7 - rVar.getPaddingLeft()) - rVar.getPaddingRight()) / org.telegram.messenger.g0.L(46.0f));
        if (max != this.f1677r) {
            this.f1677r = max;
            this.d.y1(max);
            post(new a3.f(this, 4));
        }
    }

    public void setHeaderColor(int i7) {
        if (this.f1681y != i7) {
            this.f1681y = i7;
            int i10 = 0;
            while (true) {
                r rVar = this.f1673c;
                if (i10 < rVar.getChildCount()) {
                    View childAt = rVar.getChildAt(i10);
                    if (childAt instanceof s) {
                        ((s) childAt).f1610a.setTextColor(i7);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }
}
