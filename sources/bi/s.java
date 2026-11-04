package bi;

import ai.g2;
import ai.j5;
import ai.j6;
import ai.v2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vi0;
public abstract class s extends FrameLayout implements cs {
    public static final long[] L = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter M = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public TLRPC.TL_messages_stickerSet E;
    public boolean F;
    public boolean G;
    public final HashSet H;
    public final HashSet I;
    public ArrayList J;
    public boolean K;
    public final int f3838a;
    public final g0 f3839b;
    public final m f3840c;
    public final u4.s d;
    public final k f3841e;
    public final vi0 f3842f;
    public final r h;
    public final ArrayList f3843n;
    public int f3844r;
    public int f3845s;
    public boolean f3846w;
    public final boolean f3847x;
    public int f3848y;

    public s(Context context, int i3, g0 g0Var) {
        super(context);
        h0 h0Var = (h0) this;
        k kVar = new k(h0Var);
        this.f3841e = kVar;
        this.f3843n = new ArrayList();
        this.f3844r = 7;
        this.f3848y = -1711276033;
        this.H = new HashSet();
        this.I = new HashSet();
        this.f3838a = i3;
        this.f3839b = g0Var;
        this.f3847x = h10.i(i3).q();
        ?? tj0Var = new tj0(context, null);
        this.f3840c = tj0Var;
        u4.s sVar = new u4.s(this.f3844r);
        this.d = sVar;
        sVar.O = new g2(h0Var, 3);
        tj0Var.setLayoutManager(sVar);
        vi0 vi0Var = new vi0(tj0Var, sVar);
        this.f3842f = vi0Var;
        vi0Var.f39131i = new h(h0Var, 0);
        tj0Var.setAdapter(kVar);
        tj0Var.setSelectorDrawableColor(0);
        tj0Var.setOnItemClickListener(new j6(g0Var, 1));
        tj0Var.setItemAnimator(null);
        tj0Var.setOverScrollMode(2);
        tj0Var.setVerticalScrollBarEnabled(false);
        tj0Var.setClipToPadding(false);
        tj0Var.j(new j5(h0Var, 4));
        addView((View) tj0Var, mf.c(-1.0f, -1));
        r rVar = new r(h0Var, context);
        this.h = rVar;
        addView(rVar, mf.e(-1, 36, 48));
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
        if ((drawable instanceof g5) && zi.D4(((g5) drawable).f33966e)) {
            return true;
        }
        return false;
    }

    public final ArrayList a() {
        String[] split;
        if (this.J == null) {
            this.J = new ArrayList();
            for (String str : hp.s1(this.f3838a).f22999e7.getString("qrAppliedEmoji", "").split(",")) {
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
        m mVar = this.f3840c;
        int paddingTop = mVar.getPaddingTop();
        int i3 = Integer.MAX_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < mVar.getChildCount(); i11++) {
            View childAt = mVar.getChildAt(i11);
            this.d.getClass();
            int z10 = u4.o0.z(childAt);
            if (z10 >= paddingTop && z10 < i3 && (R = RecyclerView.R(childAt)) != -1) {
                i10 = R;
                i3 = z10;
            }
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23333x0 && objArr.length > 0) {
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
        long j10;
        long j11;
        long j12;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        String str3;
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        int i3;
        int i10;
        boolean z10;
        HashSet hashSet;
        TLRPC.Document document;
        String str4;
        HashSet hashSet2;
        ArrayList<TLRPC.Document> arrayList4;
        int i11 = this.f3838a;
        li b02 = li.b0(i11);
        ArrayList<o> arrayList5 = this.f3843n;
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
            TLRPC.TL_messages_stickerSet l02 = li.b0(i11).l0(tL_inputStickerSetShortName, null, false, true, new v2(this, 4));
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
                        hashMap.put(Long.valueOf(document5.f27007id), document5);
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
                    j10 = 0;
                    if (tL_stickerPack2 != null && (str3 = tL_stickerPack2.emoticon) != null && str3.replace("️", "").equals("❄") && (arrayList2 = tL_stickerPack2.documents) != null && !arrayList2.isEmpty()) {
                        j11 = tL_stickerPack2.documents.get(0).longValue();
                        break;
                    }
                }
            }
            j10 = 0;
            j11 = 0;
            int i18 = 0;
            for (int i19 = 21; i18 < i19; i19 = 21) {
                if (i18 == 4 && j11 != j10 && hashMap.containsKey(Long.valueOf(j11))) {
                    j12 = j11;
                } else {
                    j12 = L[i18];
                }
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j12));
                if (document6 == null) {
                    document6 = g5.e(i11, j12);
                }
                if (document6 != null) {
                    arrayList9.add(document6);
                    hashSet3.add(Long.valueOf(document6.f27007id));
                } else if (this.H.add(Long.valueOf(j12))) {
                    g5.g(i11).b(j12, new d5() {
                        @Override
                        public final void a(TLRPC.Document document7) {
                            org.telegram.messenger.g0.h3(new a1.f(10, s.this, document7));
                        }
                    });
                }
                i18++;
            }
        }
        if (!arrayList9.isEmpty()) {
            arrayList5.add(new o(0, bd.M0(2131746505, null), arrayList9));
        }
        ArrayList arrayList10 = new ArrayList();
        HashSet hashSet4 = new HashSet();
        int i20 = this.f3844r * 3;
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
                    if (document.f27007id == longValue) {
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
                    if (hashSet2.add(Long.valueOf(document.f27007id))) {
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
            ArrayList arrayList11 = i6.f23452i;
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
                    if (z10 && hashSet5.add(Long.valueOf(e10.f27007id))) {
                        arrayList10.add(e10);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i23++;
        }
        if (!arrayList10.isEmpty()) {
            i3 = 1;
            arrayList5.add(new o(1, bd.M0(2131746369, null), arrayList10));
        } else {
            i3 = 1;
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
            if (oVar2.f3804b != null) {
                i10 = i3;
            } else {
                i10 = 0;
            }
            i24 += oVar2.f3805c.size() + i10;
        }
        this.f3845s = i24;
        this.f3841e.f();
        r rVar = this.h;
        rVar.setSections(arrayList5);
        rVar.a(f(c()), false);
    }

    public final int f(int i3) {
        ArrayList arrayList = this.f3843n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((o) arrayList.get(size)).d <= i3) {
                return size;
            }
        }
        return 0;
    }

    public m getGrid() {
        return this.f3840c;
    }

    public r getTabs() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = this.f3838a;
        hs.f(i3).c(this, hs.f23333x0);
        hs.f(i3).c(this, hs.B0);
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.f3838a;
        hs.f(i3).n(this, hs.f23333x0);
        hs.f(i3).n(this, hs.B0);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        m mVar = this.f3840c;
        int max = Math.max(5, ((i3 - mVar.getPaddingLeft()) - mVar.getPaddingRight()) / org.telegram.messenger.g0.L(46.0f));
        if (max != this.f3844r) {
            this.f3844r = max;
            this.d.y1(max);
            post(new ai.s(this, 17));
        }
    }

    public void setHeaderColor(int i3) {
        if (this.f3848y != i3) {
            this.f3848y = i3;
            int i10 = 0;
            while (true) {
                m mVar = this.f3840c;
                if (i10 < mVar.getChildCount()) {
                    View childAt = mVar.getChildAt(i10);
                    if (childAt instanceof n) {
                        ((n) childAt).f3798a.setTextColor(i3);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }
}
