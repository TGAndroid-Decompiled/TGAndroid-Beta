package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class wta implements w18, oac, lg0, OnSuccessListener, ln5, ee, iab, vna, CameraController.VideoTakeCallback, qq7, fu2, Vector.TLDeserializer, dja, l8, h59, zy5, gla, yeb, i99, au9, Continuation {
    public final byte a;
    public final Object b;

    public wta(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        int a;
        oab oabVar = (oab) this.b;
        int i = 0;
        iq5 H0 = gm.H0(wzcVar, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oabVar.w.getLayoutParams();
        if (!oabVar.c) {
            i = wzcVar.d();
        }
        marginLayoutParams.topMargin = i;
        if (oabVar.c) {
            a = wzcVar.a.f(2).d;
        } else {
            a = wzcVar.a();
        }
        marginLayoutParams.bottomMargin = a;
        marginLayoutParams.leftMargin = H0.a;
        marginLayoutParams.rightMargin = H0.c;
        cab cabVar = oabVar.s;
        if (cabVar != null) {
            cabVar.requestLayout();
        }
        dab dabVar = oabVar.w;
        if (dabVar != null) {
            dabVar.requestLayout();
        }
        return wzc.b;
    }

    @Override
    public final boolean F1(int i) {
        return true;
    }

    @Override
    public final vh6 G0() {
        return null;
    }

    @Override
    public final void a(String str) {
        c2c c2cVar = (c2c) this.b;
        c2cVar.Z1 = str;
        c2cVar.e2.O(true);
    }

    @Override
    public final void accept(Object obj) {
        ((jo5) this.b).c((i53) obj);
    }

    @Override
    public final void b() {
        ((krb) this.b).e();
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        p09 y;
        z1b z1bVar = (z1b) this.b;
        if (z && !z2 && (y = imageReceiver.y()) != null) {
            z1bVar.q(y);
        }
    }

    @Override
    public final void c(int i) {
        fv4 fv4Var = (fv4) this.b;
        if (i == 1) {
            fv4Var.a(Boolean.TRUE, null);
        } else if (i != 3) {
            fv4Var.a(Boolean.FALSE, null);
        }
    }

    @Override
    public final void d(rna rnaVar, float f, float f2) {
        k5b k5bVar;
        j5b j5bVar = (j5b) this.b;
        if (!j5bVar.v.y) {
            rnaVar.q = new i5b(j5bVar, (byte) 2);
            float sqrt = (float) Math.sqrt(Math.pow(k5bVar.getHeight(), 2.0d) + Math.pow(k5bVar.getWidth(), 2.0d));
            ArrayList arrayList = j5bVar.i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((rna) obj).j(f, f2, sqrt, false);
            }
        }
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) obj).lambda$readParams$0(inputSerializedData, i, z);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) obj).lambda$readParams$0(inputSerializedData, i, z);
                return lambda$readParams$02;
        }
    }

    @Override
    public final Object e() {
        mq9 mq9Var = (mq9) ((za0) this.b).i;
        SQLiteDatabase a = mq9Var.a();
        a.beginTransaction();
        try {
            a.compileStatement("DELETE FROM log_event_dropped").execute();
            a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + mq9Var.b.a()).execute();
            a.setTransactionSuccessful();
            a.endTransaction();
            return null;
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
    }

    @Override
    public final vh6 e1() {
        return null;
    }

    @Override
    public final float f(RecyclerView recyclerView) {
        return fja.j(recyclerView);
    }

    @Override
    public final boolean g(int i, View view) {
        ((avb) this.b).K.g(i, view);
        return true;
    }

    @Override
    public final RecyclerView h(View view) {
        ((mxa) this.b).getClass();
        return ((kxa) view).a;
    }

    @Override
    public final void i(int i) {
        qac qacVar = ((c6c) this.b).D;
        if (qacVar != null) {
            qacVar.a(Integer.valueOf(i));
        }
    }

    @Override
    public final void j(float f, Canvas canvas, RectF rectF, boolean z) {
        Path path = (Path) this.b;
        if (z) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f, 2.0d);
        path.addCircle((rectF.right + gm.L(7.0f)) - (gm.L(14.0f) * pow), (rectF.bottom + gm.L(7.0f)) - (gm.L(14.0f) * pow), gm.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        d S;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                kxa kxaVar = (kxa) obj3;
                c6c c6cVar = (c6c) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                Object obj4 = c6cVar.H;
                if (obj4 instanceof TL_stars.StarsTransaction) {
                    nxa.l1(kxaVar.getContext(), false, 0L, kxaVar.c, (TL_stars.StarsTransaction) c6cVar.H, kxaVar.b);
                    return;
                } else if ((obj4 instanceof TL_wallet.walletTransaction) && (S = LaunchActivity.S()) != null) {
                    S.presentFragment(new goc());
                    return;
                } else {
                    return;
                }
            case 14:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f3 = (Float) serializable;
                Float f4 = (Float) serializable2;
                ((hdb) obj3).a0((c6c) obj);
                return;
            default:
                Integer num3 = (Integer) number;
                Float f5 = (Float) serializable;
                Float f6 = (Float) serializable2;
                ((wqb) obj3).a0((c6c) obj, (View) obj2);
                return;
        }
    }

    @Override
    public final void o(int i) {
        cac cacVar = (cac) this.b;
        if (cacVar.h == null && !cacVar.f.e()) {
            cacVar.w.f.e(false, true);
        }
        cacVar.f();
    }

    @Override
    public final void onFinishVideoRecording(String str, long j) {
        v8b v8bVar = (v8b) this.b;
        v9b v9bVar = v8bVar.a;
        j49 j49Var = v9bVar.P0;
        int i = v9bVar.c;
        if (j49Var != null) {
            j49Var.g(true);
        }
        if (v9bVar.p0()) {
            v9bVar.s.d();
        }
        if (v9bVar.H1 != null && v9bVar.C0 != null) {
            v9bVar.R1 = false;
            v9bVar.S1 = false;
            ex8 ex8Var = v9bVar.D0;
            if (ex8Var != null) {
                ex8Var.f(false);
            }
            if (j <= 800) {
                v9bVar.e(false, true);
                v9bVar.c0(false);
                v9bVar.K0.b(false, true);
                j49 j49Var2 = v9bVar.P0;
                if (j49Var2 != null) {
                    j49Var2.g(true);
                }
                try {
                    v9bVar.H1.delete();
                    v9bVar.H1 = null;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        return;
                    }
                }
                return;
            }
            v9bVar.h0(false, true);
            g6b o = g6b.o(v9bVar.H1, str, j);
            o.J0 = v9bVar.w0;
            o.K0 = v9bVar.x0;
            o.A();
            v9bVar.e(false, true);
            v9bVar.c0(false);
            v9bVar.K0.b(false, true);
            j49 j49Var3 = v9bVar.P0;
            if (j49Var3 != null) {
                j49Var3.g(true);
            }
            if (v9bVar.B0.i()) {
                v9bVar.H1 = null;
                o.P = 1.0f;
                if (v9bVar.B0.l(o)) {
                    g6b a = g6b.a(v9bVar.B0.getLayout(), v9bVar.B0.getContent());
                    v9bVar.L1 = a;
                    c8b.a(i, a);
                    v9bVar.M1 = false;
                    int videoWidth = v9bVar.C0.getVideoWidth();
                    int videoHeight = v9bVar.C0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        g6b g6bVar = v9bVar.L1;
                        g6bVar.k0 = videoWidth;
                        g6bVar.l0 = videoHeight;
                        g6bVar.z();
                    }
                }
                v9bVar.l0(true);
                return;
            }
            v9bVar.L1 = o;
            c8b.a(i, o);
            v9bVar.M1 = false;
            int videoWidth2 = v9bVar.C0.getVideoWidth();
            int videoHeight2 = v9bVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                g6b g6bVar2 = v9bVar.L1;
                g6bVar2.k0 = videoWidth2;
                g6bVar2.l0 = videoHeight2;
                g6bVar2.z();
            }
            v9bVar.J(new t8b(v8bVar, (byte) 3), 0L);
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                h71 h71Var = (h71) obj2;
                fcb fcbVar = (fcb) obj;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < fcbVar.a.size(); i++) {
                    ecb ecbVar = (ecb) fcbVar.a.get(i);
                    ?? obj3 = new Object();
                    obj3.a = ecbVar.a;
                    obj3.b = ecbVar.d;
                    obj3.c = ecbVar.e;
                    obj3.d = ecbVar.b;
                    obj3.e = ecbVar.c;
                    arrayList.add(obj3);
                }
                h71Var.a(arrayList);
                return;
            default:
                n1b n1bVar = (n1b) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    fc4.b("objimg: no objects");
                    return;
                }
                int i2 = ((fm5) list.get(0)).c;
                String[] strArr = dse.a;
                String str = null;
                if (strArr == null) {
                    strArr = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    dse.a = strArr;
                }
                if (i2 >= 0 && i2 < strArr.length) {
                    str = strArr[i2];
                }
                n1bVar.d0 = str;
                StringBuilder sb = new StringBuilder("objimg: detected #");
                sb.append(((fm5) list.get(0)).c);
                sb.append(" ");
                sb.append(n1bVar.d0);
                sb.append(" ");
                hg9.r(((fm5) list.get(0)).a, sb);
                gw3.g(n1bVar.d0);
                return;
        }
    }

    @Override
    public final void q(RecyclerView recyclerView) {
        hg9.d(recyclerView);
    }

    @Override
    public final void r(he heVar, int i) {
        int i2;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 6:
                z2b z2bVar = (z2b) obj;
                z2bVar.e.presentFragment(new StickersActivity(z2bVar.d ? 1 : 0, null));
                heVar.dismiss();
                return;
            case 7:
                gm.t1((a3b) obj);
                heVar.dismiss();
                return;
            case 18:
                ThemeActivity themeActivity = ((mmb) obj).a;
                if (gm.O1()) {
                    i2 = 18;
                } else {
                    i2 = 16;
                }
                boolean D0 = themeActivity.D0(i2);
                if (themeActivity.C0(17, true)) {
                    D0 = true;
                }
                if (D0) {
                    themeActivity.a.h(ThemeActivity.d0(themeActivity), new Object());
                    themeActivity.a.h(ThemeActivity.e0(themeActivity), new Object());
                }
                if (themeActivity.c != null) {
                    bmb O0 = cmb.O0("Blue");
                    bmb B0 = cmb.B0();
                    SparseArray sparseArray = O0.b0;
                    byte b2 = cmb.n;
                    amb ambVar = (amb) sparseArray.get(b2);
                    if (ambVar != null) {
                        xlb xlbVar = new xlb();
                        xlbVar.c = "d";
                        xlbVar.a = "Blue_99_wp.jpg";
                        xlbVar.b = "Blue_99_wp.jpg";
                        ambVar.y = xlbVar;
                        O0.v(xlbVar);
                    }
                    if (O0 != B0) {
                        O0.u(b2);
                        cmb.x1(O0, true, false, true, false, false);
                        themeActivity.c.B1(O0, null);
                        themeActivity.c.z0(0);
                        return;
                    } else if (O0.Z != b2) {
                        if (themeActivity.f == 1) {
                            z = true;
                        }
                        cmb.I1(B0, z, b2, null);
                        themeActivity.a.g(themeActivity.r0);
                        return;
                    } else {
                        cmb.s1(true);
                        return;
                    }
                }
                return;
            case 19:
                rob robVar = ((vnb) obj).a;
                bmb bmbVar = robVar.g0;
                cmb.j0(bmbVar, robVar.w, true);
                cmb.o();
                cmb.r1(false, false);
                nm7.e().k(275, bmbVar, Boolean.valueOf(robVar.h0), null, -1);
                robVar.finishFragment();
                return;
            default:
                ((n5c) obj).a.J0(true);
                return;
        }
    }

    @Override
    public final void t(long j, yw7 yw7Var) {
        vsd.b(j, yw7Var, ((xx9) this.b).c);
    }

    @Override
    public final Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override
    public final void m() {
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void a2(ArrayList arrayList) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
