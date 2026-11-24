package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class sv8 extends FrameLayout implements gk7 {
    public static final long[] L = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter M = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public TLRPC.TL_messages_stickerSet E;
    public boolean F;
    public boolean G;
    public final HashSet H;
    public final HashSet I;
    public ArrayList J;
    public boolean K;
    public final int a;
    public final dw8 b;
    public final nv8 c;
    public final r35 d;
    public final lv8 e;
    public final cu6 f;
    public final rv8 h;
    public final ArrayList n;
    public int r;
    public int s;
    public boolean w;
    public final boolean x;
    public int y;

    public sv8(Activity activity, int i, dw8 dw8Var) {
        super(activity);
        ew8 ew8Var = (ew8) this;
        lv8 lv8Var = new lv8(ew8Var);
        this.e = lv8Var;
        this.n = new ArrayList();
        this.r = 7;
        this.y = -1711276033;
        this.H = new HashSet();
        this.I = new HashSet();
        this.a = i;
        this.b = dw8Var;
        this.x = y6c.h(i).p();
        ?? o39Var = new o39(activity, null);
        this.c = o39Var;
        r35 r35Var = new r35(this.r);
        this.d = r35Var;
        r35Var.O = new nq1(ew8Var, (byte) 13);
        o39Var.setLayoutManager(r35Var);
        cu6 cu6Var = new cu6(o39Var, r35Var);
        this.f = cu6Var;
        cu6Var.r = new fv3(ew8Var, (byte) 1);
        o39Var.setAdapter(lv8Var);
        o39Var.setSelectorDrawableColor(0);
        o39Var.setOnItemClickListener(new bf4(dw8Var, (byte) 28));
        o39Var.setItemAnimator(null);
        o39Var.setOverScrollMode(2);
        o39Var.setVerticalScrollBarEnabled(false);
        o39Var.setClipToPadding(false);
        o39Var.j(new n58(ew8Var, (byte) 7));
        addView((View) o39Var, nme.c(-1.0f, -1));
        rv8 rv8Var = new rv8(ew8Var, activity);
        this.h = rv8Var;
        addView(rv8Var, nme.e(-1, 36, 48));
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
        if ((drawable instanceof vl) && k27.B4(((vl) drawable).e)) {
            return true;
        }
        return false;
    }

    public final ArrayList a() {
        String[] split;
        if (this.J == null) {
            this.J = new ArrayList();
            for (String str : na7.q1(this.a).X3.getString("qrAppliedEmoji", "").split(",")) {
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
        nv8 nv8Var = this.c;
        int paddingTop = nv8Var.getPaddingTop();
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < nv8Var.getChildCount(); i3++) {
            View childAt = nv8Var.getChildAt(i3);
            this.d.getClass();
            int y = d49.y(childAt);
            if (y >= paddingTop && y < i && (R = RecyclerView.R(childAt)) != -1) {
                i2 = R;
                i = y;
            }
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.w0 && objArr.length > 0) {
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
        long j;
        long j2;
        long j3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        int i;
        int i2;
        boolean z;
        ArrayList arrayList4;
        int i3;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList5;
        int i4 = this.a;
        hq6 d0 = hq6.d0(i4);
        ArrayList<pv8> arrayList6 = this.n;
        arrayList6.clear();
        ArrayList arrayList7 = new ArrayList();
        ArrayList t0 = d0.t0(5);
        int size = t0.size();
        int i5 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i5 >= size) {
                break;
            }
            Object obj = t0.get(i5);
            i5++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null && tL_messages_stickerSet.documents != null) {
                ArrayList arrayList8 = new ArrayList();
                ArrayList<TLRPC.Document> arrayList9 = tL_messages_stickerSet.documents;
                int size2 = arrayList9.size();
                int i6 = 0;
                while (i6 < size2) {
                    TLRPC.Document document2 = arrayList9.get(i6);
                    i6++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null && "application/x-tgsticker".equals(document3.mime_type)) {
                        arrayList8.add(document3);
                    }
                }
                if (!arrayList8.isEmpty()) {
                    arrayList7.add(new pv8(2, tL_messages_stickerSet.set.title, arrayList8));
                }
            }
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet m0 = hq6.d0(i4).m0(tL_inputStickerSetShortName, null, false, true, new zf7(this, (byte) 20));
            if (m0 != null && (arrayList5 = m0.documents) != null && !arrayList5.isEmpty()) {
                this.E = m0;
            }
        }
        ArrayList arrayList10 = new ArrayList(21);
        HashSet hashSet = this.I;
        hashSet.clear();
        if (this.E == null && !this.G) {
            for (int i7 = 0; i7 < 21; i7++) {
                arrayList10.add(new TLRPC.TL_documentEmpty());
            }
            str2 = "application/x-tgsticker";
        } else {
            HashMap hashMap = new HashMap();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.E;
            if (tL_messages_stickerSet2 != null && (arrayList3 = tL_messages_stickerSet2.documents) != null) {
                int size3 = arrayList3.size();
                int i8 = 0;
                while (i8 < size3) {
                    TLRPC.Document document4 = arrayList3.get(i8);
                    i8++;
                    TLRPC.Document document5 = document4;
                    String str3 = str;
                    if (document5 != null) {
                        hashMap.put(Long.valueOf(document5.id), document5);
                    }
                    str = str3;
                }
            }
            str2 = str;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.E;
            if (tL_messages_stickerSet3 != null && (arrayList = tL_messages_stickerSet3.packs) != null) {
                int size4 = arrayList.size();
                int i9 = 0;
                while (i9 < size4) {
                    TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i9);
                    i9++;
                    TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                    if (tL_stickerPack2 != null) {
                        j = 0;
                        String str4 = tL_stickerPack2.emoticon;
                        if (str4 != null && str4.replace("️", "").equals("❄") && (arrayList2 = tL_stickerPack2.documents) != null && !arrayList2.isEmpty()) {
                            j2 = tL_stickerPack2.documents.get(0).longValue();
                            break;
                        }
                    }
                }
            }
            j = 0;
            j2 = 0;
            for (int i10 = 0; i10 < 21; i10++) {
                if (i10 == 4 && j2 != j && hashMap.containsKey(Long.valueOf(j2))) {
                    j3 = j2;
                } else {
                    j3 = L[i10];
                }
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j3));
                if (document6 == null) {
                    document6 = vl.e(i4, j3);
                }
                if (document6 != null) {
                    arrayList10.add(document6);
                    hashSet.add(Long.valueOf(document6.id));
                } else if (this.H.add(Long.valueOf(j3))) {
                    vl.g(i4).b(j3, new a27(this, (byte) 1));
                }
            }
        }
        if (!arrayList10.isEmpty()) {
            arrayList6.add(new pv8(0, k96.M0(2131746304, null), arrayList10));
        }
        ArrayList arrayList11 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        int i11 = this.r * 3;
        ArrayList a = a();
        int i12 = 0;
        while (i12 < a.size() && arrayList11.size() < i11) {
            long longValue = ((Long) a.get(i12)).longValue();
            int size5 = arrayList10.size();
            int i13 = 0;
            while (true) {
                if (i13 < size5) {
                    Object obj2 = arrayList10.get(i13);
                    i13++;
                    document = (TLRPC.Document) obj2;
                    arrayList4 = a;
                    i3 = i12;
                    if (document.id == longValue) {
                        break;
                    }
                    a = arrayList4;
                    i12 = i3;
                } else {
                    arrayList4 = a;
                    i3 = i12;
                    document = null;
                    break;
                }
            }
            if (document == null) {
                document = vl.e(i4, longValue);
            }
            if (document != null && str2.equals(document.mime_type) && hashSet2.add(Long.valueOf(document.id))) {
                arrayList11.add(document);
            }
            i12 = i3 + 1;
            a = arrayList4;
        }
        int i14 = 0;
        while (true) {
            ArrayList arrayList12 = vu3.i;
            if (i14 >= arrayList12.size() || arrayList11.size() >= i11) {
                break;
            }
            String str5 = (String) arrayList12.get(i14);
            if (str5 != null && str5.startsWith("animated_")) {
                try {
                    TLRPC.Document e = vl.e(i4, Long.parseLong(str5.substring(9)));
                    if (e != null && str2.equals(e.mime_type)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && hashSet2.add(Long.valueOf(e.id))) {
                        arrayList11.add(e);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i14++;
        }
        if (!arrayList11.isEmpty()) {
            i = 1;
            arrayList6.add(new pv8(1, k96.M0(2131746168, null), arrayList11));
        } else {
            i = 1;
        }
        arrayList6.addAll(arrayList7);
        int size6 = arrayList6.size();
        int i15 = 0;
        int i16 = 0;
        while (i15 < size6) {
            pv8 pv8Var = arrayList6.get(i15);
            i15++;
            pv8 pv8Var2 = pv8Var;
            pv8Var2.d = i16;
            if (pv8Var2.b != null) {
                i2 = i;
            } else {
                i2 = 0;
            }
            i16 += pv8Var2.c.size() + i2;
        }
        this.s = i16;
        this.e.f();
        rv8 rv8Var = this.h;
        rv8Var.setSections(arrayList6);
        rv8Var.a(f(c()), false);
    }

    public final int f(int i) {
        ArrayList arrayList = this.n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((pv8) arrayList.get(size)).d <= i) {
                return size;
            }
        }
        return 0;
    }

    public nv8 getGrid() {
        return this.c;
    }

    public rv8 getTabs() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        kk7.f(i).b(this, kk7.w0);
        kk7.f(i).b(this, kk7.A0);
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        kk7.f(i).n(this, kk7.w0);
        kk7.f(i).n(this, kk7.A0);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        nv8 nv8Var = this.c;
        int max = Math.max(5, ((i - nv8Var.getPaddingLeft()) - nv8Var.getPaddingRight()) / gl.L(46.0f));
        if (max != this.r) {
            this.r = max;
            this.d.x1(max);
            post(new iv8(this));
        }
    }

    public void setHeaderColor(int i) {
        if (this.y != i) {
            this.y = i;
            int i2 = 0;
            while (true) {
                nv8 nv8Var = this.c;
                if (i2 < nv8Var.getChildCount()) {
                    View childAt = nv8Var.getChildAt(i2);
                    if (childAt instanceof ov8) {
                        ((ov8) childAt).a.setTextColor(i);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
