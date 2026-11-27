package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class hja implements on5, ovc, jcc, yv4, ay2, s84, ncc, z28, nf0, OnSuccessListener, fd, fcb, rpa, CameraController.VideoTakeCallback, nr7, ot2, Vector.TLDeserializer, uka {
    public final byte a;
    public final Object b;

    public hja(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        int a;
        lcb lcbVar = (lcb) this.b;
        int i = 0;
        mq5 H0 = hl.H0(l2dVar, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lcbVar.w.getLayoutParams();
        if (!lcbVar.c) {
            i = l2dVar.d();
        }
        marginLayoutParams.topMargin = i;
        if (lcbVar.c) {
            a = l2dVar.a.f(2).d;
        } else {
            a = l2dVar.a();
        }
        marginLayoutParams.bottomMargin = a;
        marginLayoutParams.leftMargin = H0.a;
        marginLayoutParams.rightMargin = H0.c;
        zbb zbbVar = lcbVar.s;
        if (zbbVar != null) {
            zbbVar.requestLayout();
        }
        acb acbVar = lcbVar.w;
        if (acbVar != null) {
            acbVar.requestLayout();
        }
        return l2d.b;
    }

    @Override
    public final void a(Canvas canvas) {
        woa woaVar = (woa) this.b;
        canvas.save();
        canvas.translate(woaVar.a.getX(), woaVar.a.getY());
        woaVar.a.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void accept(Object obj) {
        ((mo5) this.b).c((p43) obj);
    }

    @Override
    public final float b(RecyclerView recyclerView) {
        return wka.j(recyclerView);
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                icc iccVar = (icc) obj;
                if (i == 1) {
                    iccVar.a(Boolean.TRUE, null);
                    return;
                } else if (i != 3) {
                    iccVar.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 8:
                iv4 iv4Var = (iv4) obj;
                if (i == 1) {
                    iv4Var.a(Boolean.TRUE, null);
                    return;
                } else if (i != 3) {
                    iv4Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                qe2 qe2Var = (qe2) obj;
                if (i == 1) {
                    qe2Var.a(Boolean.TRUE, null);
                    return;
                } else if (i != 3) {
                    qe2Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void d(npa npaVar, float f, float f2) {
        f7b f7bVar;
        e7b e7bVar = (e7b) this.b;
        if (!e7bVar.v.y) {
            npaVar.q = new d7b(e7bVar, (byte) 2);
            float sqrt = (float) Math.sqrt(Math.pow(f7bVar.getHeight(), 2.0d) + Math.pow(f7bVar.getWidth(), 2.0d));
            ArrayList arrayList = e7bVar.i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((npa) obj).j(f, f2, sqrt, false);
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
            case 24:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) obj).lambda$readParams$0(inputSerializedData, i, z);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) obj).lambda$readParams$0(inputSerializedData, i, z);
                return lambda$readParams$02;
        }
    }

    @Override
    public final void e(int i, int i2) {
        wma wmaVar = (wma) this.b;
        wmaVar.x = i;
        wmaVar.y = i2;
        nf9 nf9Var = wmaVar.M;
        if (nf9Var != null) {
            nf9Var.invalidate();
        }
    }

    @Override
    public final void f(float f, Canvas canvas, RectF rectF, boolean z) {
        Path path = (Path) this.b;
        if (z) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f, 2.0d);
        path.addCircle((rectF.right + hl.L(7.0f)) - (hl.L(14.0f) * pow), (rectF.bottom + hl.L(7.0f)) - (hl.L(14.0f) * pow), hl.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public final Object g(Integer num, Object obj) {
        return (CharSequence) ((sb) this.b).a((Integer) obj);
    }

    @Override
    public final RecyclerView h(View view) {
        ((mza) this.b).getClass();
        return ((kza) view).a;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        e S;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 6:
                ((jxa) obj3).S((ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                return;
            case 10:
                kza kzaVar = (kza) obj3;
                b8c b8cVar = (b8c) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                Object obj4 = b8cVar.H;
                if (obj4 instanceof TL_stars.StarsTransaction) {
                    nza.l1(kzaVar.getContext(), false, 0L, kzaVar.c, (TL_stars.StarsTransaction) b8cVar.H, kzaVar.b);
                    return;
                } else if ((obj4 instanceof TL_wallet.walletTransaction) && (S = LaunchActivity.S()) != null) {
                    S.presentFragment(new uqc());
                    return;
                } else {
                    return;
                }
            case 23:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f3 = (Float) serializable;
                Float f4 = (Float) serializable2;
                ((bfb) obj3).Z((b8c) obj);
                return;
            default:
                Integer num3 = (Integer) number;
                Float f5 = (Float) serializable;
                Float f6 = (Float) serializable2;
                ((vsb) obj3).Z((b8c) obj, (View) obj2);
                return;
        }
    }

    @Override
    public final void l(long j) {
        ((kua) this.b).f();
    }

    @Override
    public final void o(RecyclerView recyclerView) {
        uh9.d(recyclerView);
    }

    @Override
    public final void onFinishVideoRecording(String str, long j) {
        sab sabVar = (sab) this.b;
        sbb sbbVar = sabVar.a;
        u59 u59Var = sbbVar.P0;
        int i = sbbVar.c;
        if (u59Var != null) {
            u59Var.g(true);
        }
        if (sbbVar.p0()) {
            sbbVar.s.d();
        }
        if (sbbVar.H1 != null && sbbVar.C0 != null) {
            sbbVar.R1 = false;
            sbbVar.S1 = false;
            oy8 oy8Var = sbbVar.D0;
            if (oy8Var != null) {
                oy8Var.f(false);
            }
            if (j <= 800) {
                sbbVar.e(false, true);
                sbbVar.c0(false);
                sbbVar.K0.b(false, true);
                u59 u59Var2 = sbbVar.P0;
                if (u59Var2 != null) {
                    u59Var2.g(true);
                }
                try {
                    sbbVar.H1.delete();
                    sbbVar.H1 = null;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        return;
                    }
                }
                return;
            }
            sbbVar.h0(false, true);
            c8b o = c8b.o(sbbVar.H1, str, j);
            o.J0 = sbbVar.w0;
            o.K0 = sbbVar.x0;
            o.A();
            sbbVar.e(false, true);
            sbbVar.c0(false);
            sbbVar.K0.b(false, true);
            u59 u59Var3 = sbbVar.P0;
            if (u59Var3 != null) {
                u59Var3.g(true);
            }
            if (sbbVar.B0.i()) {
                sbbVar.H1 = null;
                o.P = 1.0f;
                if (sbbVar.B0.l(o)) {
                    c8b a = c8b.a(sbbVar.B0.getLayout(), sbbVar.B0.getContent());
                    sbbVar.L1 = a;
                    y9b.a(i, a);
                    sbbVar.M1 = false;
                    int videoWidth = sbbVar.C0.getVideoWidth();
                    int videoHeight = sbbVar.C0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        c8b c8bVar = sbbVar.L1;
                        c8bVar.k0 = videoWidth;
                        c8bVar.l0 = videoHeight;
                        c8bVar.z();
                    }
                }
                sbbVar.l0(true);
                return;
            }
            sbbVar.L1 = o;
            y9b.a(i, o);
            sbbVar.M1 = false;
            int videoWidth2 = sbbVar.C0.getVideoWidth();
            int videoHeight2 = sbbVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                c8b c8bVar2 = sbbVar.L1;
                c8bVar2.k0 = videoWidth2;
                c8bVar2.l0 = videoHeight2;
                c8bVar2.z();
            }
            sbbVar.J(new qab(sabVar, (byte) 3), 0L);
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 12:
                i61 i61Var = (i61) obj2;
                beb bebVar = (beb) obj;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < bebVar.a.size(); i++) {
                    aeb aebVar = (aeb) bebVar.a.get(i);
                    ?? obj3 = new Object();
                    obj3.a = aebVar.a;
                    obj3.b = aebVar.d;
                    obj3.c = aebVar.e;
                    obj3.d = aebVar.b;
                    obj3.e = aebVar.c;
                    arrayList.add(obj3);
                }
                i61Var.a(arrayList);
                return;
            default:
                k3b k3bVar = (k3b) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    cc4.b("objimg: no objects");
                    return;
                }
                int i2 = ((im5) list.get(0)).c;
                String[] strArr = sue.a;
                String str = null;
                if (strArr == null) {
                    strArr = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    sue.a = strArr;
                }
                if (i2 >= 0 && i2 < strArr.length) {
                    str = strArr[i2];
                }
                k3bVar.d0 = str;
                StringBuilder sb = new StringBuilder("objimg: detected #");
                sb.append(((im5) list.get(0)).c);
                sb.append(" ");
                sb.append(k3bVar.d0);
                sb.append(" ");
                uh9.s(((im5) list.get(0)).a, sb);
                pv3.g(k3bVar.d0);
                return;
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        View view = ((yua) this.b).b;
        if (view instanceof dl1) {
            ((dl1) view).V();
        } else {
            view.invalidate();
        }
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        int v;
        r47 r47Var;
        b29 y;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jja jjaVar = (jja) obj;
                ImageReceiver imageReceiver2 = jjaVar.d;
                ImageReceiver imageReceiver3 = jjaVar.c;
                if (z && !z2 && (r47Var = jjaVar.n) != null && r47Var.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.f0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z && !z2 && jjaVar.x0 && imageReceiver3.n() != null) {
                    int I0 = hl.I0(imageReceiver3.n());
                    jjaVar.a = I0;
                    CheckBoxBase checkBoxBase = jjaVar.Q;
                    if (checkBoxBase != null && checkBoxBase.x != (v = aob.v(I0, aob.p1(0.25f, -1)))) {
                        checkBoxBase.x = v;
                        checkBoxBase.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                w3b w3bVar = (w3b) obj;
                if (z && !z2 && (y = imageReceiver.y()) != null) {
                    w3bVar.q(y);
                    return;
                }
                return;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        int i2;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 15:
                u4b u4bVar = (u4b) obj;
                u4bVar.e.presentFragment(new StickersActivity(u4bVar.d ? 1 : 0, null));
                idVar.dismiss();
                return;
            case 16:
                hl.t1((v4b) obj);
                idVar.dismiss();
                return;
            case 27:
                ThemeActivity themeActivity = ((kob) obj).a;
                if (hl.O1()) {
                    i2 = 18;
                } else {
                    i2 = 16;
                }
                boolean D0 = themeActivity.D0(i2);
                if (themeActivity.C0(17, true)) {
                    D0 = true;
                }
                if (D0) {
                    themeActivity.a.h(ThemeActivity.l0(themeActivity), new Object());
                    themeActivity.a.h(ThemeActivity.b0(themeActivity), new Object());
                }
                if (themeActivity.c != null) {
                    znb O0 = aob.O0("Blue");
                    znb B0 = aob.B0();
                    SparseArray sparseArray = O0.b0;
                    byte b2 = aob.n;
                    ynb ynbVar = (ynb) sparseArray.get(b2);
                    if (ynbVar != null) {
                        unb unbVar = new unb();
                        unbVar.c = "d";
                        unbVar.a = "Blue_99_wp.jpg";
                        unbVar.b = "Blue_99_wp.jpg";
                        ynbVar.y = unbVar;
                        O0.v(unbVar);
                    }
                    if (O0 != B0) {
                        O0.u(b2);
                        aob.x1(O0, true, false, true, false, false);
                        themeActivity.c.C1(O0, null);
                        themeActivity.c.A0(0);
                        return;
                    } else if (O0.Z != b2) {
                        if (themeActivity.f == 1) {
                            z = true;
                        }
                        aob.I1(B0, z, b2, null);
                        themeActivity.a.g(themeActivity.r0);
                        return;
                    } else {
                        aob.s1(true);
                        return;
                    }
                }
                return;
            default:
                pqb pqbVar = ((tpb) obj).a;
                znb znbVar = pqbVar.g0;
                aob.j0(znbVar, pqbVar.w, true);
                aob.o();
                aob.r1(false, false);
                jn7.e().k(274, znbVar, Boolean.valueOf(pqbVar.h0), null, -1);
                pqbVar.finishFragment();
                return;
        }
    }

    @Override
    public final void z(int i, Drawable drawable) {
        byte b = this.a;
    }

    private final void m(ImageReceiver imageReceiver) {
    }

    private final void n(ImageReceiver imageReceiver) {
    }

    private final void i(int i, Drawable drawable) {
    }

    private final void j(int i, Drawable drawable) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
