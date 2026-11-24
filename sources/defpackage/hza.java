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
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class hza implements OnSuccessListener, ll5, ed, g8b, ula, CameraController.VideoTakeCallback, no7, us2, n8c, Vector.TLDeserializer, bha, l8, e39, zw5, eja, xcb, g79, yr9, Continuation, q3b {
    public final byte a;
    public final Object b;

    public hza(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        oy8 y;
        boolean z4;
        dcc dccVar;
        int i;
        int i2;
        double d;
        double d2;
        int i3;
        int i4;
        int ceil;
        double ceil2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                yza yzaVar = (yza) obj;
                if (z && !z2 && (y = imageReceiver.y()) != null) {
                    yzaVar.q(y);
                    return;
                }
                return;
            default:
                ecc eccVar = (ecc) obj;
                ImageReceiver imageReceiver2 = eccVar.R;
                if (z) {
                    if (eccVar.O != null || eccVar.e0 != null) {
                        int L = gl.L(150.0f);
                        x88 x88Var = eccVar.O;
                        if (x88Var != null) {
                            ArrayList arrayList = x88Var.w;
                            int indexOf = arrayList.indexOf(x88Var.b((int) eccVar.P));
                            if (indexOf != -1) {
                                if (indexOf == arrayList.size() - 1) {
                                    int videoDuration = x88Var.getVideoDuration() / 1000;
                                    z4 = true;
                                    if (videoDuration <= 100) {
                                        ceil2 = Math.ceil(videoDuration);
                                    } else if (videoDuration <= 250) {
                                        ceil2 = Math.ceil(videoDuration / 2.0f);
                                    } else if (videoDuration <= 500) {
                                        ceil2 = Math.ceil(videoDuration / 4.0f);
                                    } else if (videoDuration <= 1000) {
                                        ceil2 = Math.ceil(videoDuration / 5.0f);
                                    } else {
                                        ceil2 = Math.ceil(videoDuration / 10.0f);
                                    }
                                    i4 = Math.min(25, (((int) ceil2) - ((arrayList.size() - 1) * 25)) + 1);
                                } else {
                                    z4 = true;
                                    i4 = 25;
                                }
                            } else {
                                z4 = true;
                                i4 = 0;
                            }
                            float q = imageReceiver2.q() / Math.min(i4, 5);
                            float o = imageReceiver2.o() / ((int) Math.ceil(i4 / 5.0f));
                            x88 x88Var2 = eccVar.O;
                            int i5 = (int) eccVar.P;
                            int videoDuration2 = x88Var2.getVideoDuration() / 1000;
                            if (videoDuration2 <= 100) {
                                ceil = ((int) Math.ceil(i5)) % 25;
                            } else if (videoDuration2 <= 250) {
                                ceil = ((int) Math.ceil(i5 / 2.0f)) % 25;
                            } else if (videoDuration2 <= 500) {
                                ceil = ((int) Math.ceil(i5 / 4.0f)) % 25;
                            } else if (videoDuration2 <= 1000) {
                                ceil = ((int) Math.ceil(i5 / 5.0f)) % 25;
                            } else {
                                ceil = ((int) Math.ceil(i5 / 10.0f)) % 25;
                            }
                            int min = Math.min(ceil, i4 - 1);
                            eccVar.S = (int) ((min % 5) * q);
                            eccVar.T = (int) ((min / 5) * o);
                            i = (int) q;
                            eccVar.U = i;
                            i2 = (int) o;
                            eccVar.V = i2;
                        } else {
                            z4 = true;
                            int i6 = 0;
                            while (true) {
                                if (i6 < eccVar.e0.size()) {
                                    dccVar = (dcc) eccVar.e0.get(i6);
                                    if (i6 == 0) {
                                        d = 0.0d;
                                    } else {
                                        d = dccVar.a;
                                    }
                                    if (i6 == eccVar.e0.size() - 1) {
                                        d2 = 9.9999999E7d;
                                    } else {
                                        d2 = ((dcc) eccVar.e0.get(i6 + 1)).a;
                                    }
                                    double d3 = eccVar.P;
                                    if (d3 < d || d3 > d2) {
                                        i6++;
                                    }
                                } else {
                                    dccVar = null;
                                }
                            }
                            if (dccVar != null) {
                                eccVar.S = dccVar.b;
                                eccVar.T = dccVar.c;
                                i = eccVar.c0;
                                eccVar.U = i;
                                i2 = eccVar.d0;
                                eccVar.V = i2;
                            } else {
                                return;
                            }
                        }
                        eccVar.Q = z4;
                        float f = i / i2;
                        if (f > 1.0f) {
                            i3 = (int) (L / f);
                        } else {
                            L = (int) (L * f);
                            i3 = L;
                        }
                        ViewGroup.LayoutParams layoutParams = eccVar.getLayoutParams();
                        if (eccVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i3) {
                            layoutParams.width = L;
                            layoutParams.height = i3;
                            eccVar.setVisibility(0);
                            eccVar.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void E(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override
    public final vf6 O0() {
        return null;
    }

    @Override
    public final boolean U1(int i) {
        return true;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        int a;
        int i;
        int i2;
        View fragmentView;
        byte b = this.a;
        int i3 = 0;
        Object obj = this.b;
        switch (b) {
            case 8:
                m8b m8bVar = (m8b) obj;
                io5 H0 = gl.H0(vxcVar, false);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m8bVar.w.getLayoutParams();
                if (!m8bVar.c) {
                    i3 = vxcVar.d();
                }
                marginLayoutParams.topMargin = i3;
                if (m8bVar.c) {
                    a = vxcVar.a.f(2).d;
                } else {
                    a = vxcVar.a();
                }
                marginLayoutParams.bottomMargin = a;
                marginLayoutParams.leftMargin = H0.a;
                marginLayoutParams.rightMargin = H0.c;
                a8b a8bVar = m8bVar.s;
                if (a8bVar != null) {
                    a8bVar.requestLayout();
                }
                b8b b8bVar = m8bVar.w;
                if (b8bVar != null) {
                    b8bVar.requestLayout();
                }
                return vxc.b;
            default:
                ah6 ah6Var = (ah6) ((jec) obj);
                io5 H02 = gl.H0(vxcVar, false);
                int i4 = H02.a;
                ah6Var.N = i4;
                int i5 = H02.c;
                ah6Var.O = i5;
                ah6Var.M = H02.d;
                boolean a2 = ah6Var.E.a();
                if (a2) {
                    i = gl.L(44.0f);
                } else {
                    i = 0;
                }
                ah6Var.E.setPadding(0, 0, 0, ah6Var.M);
                int L = gl.L(72.0f) + ah6Var.M + i;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ah6Var.I.getLayoutParams();
                if (marginLayoutParams2.height != L) {
                    marginLayoutParams2.height = L;
                    ah6Var.I.setLayoutParams(marginLayoutParams2);
                }
                if (a2) {
                    i2 = ah6Var.M + i;
                } else {
                    i2 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ah6Var.c.getLayoutParams();
                if (marginLayoutParams3.bottomMargin != i2 || marginLayoutParams3.leftMargin != i4 || marginLayoutParams3.rightMargin != i5) {
                    marginLayoutParams3.leftMargin = i4;
                    marginLayoutParams3.rightMargin = i5;
                    marginLayoutParams3.bottomMargin = i2;
                    ah6Var.c.setLayoutParams(marginLayoutParams3);
                }
                ah6Var.F.setPadding(i4, 0, i5, ah6Var.M);
                if (a2) {
                    vxcVar = vxcVar.a.m(0, 0, 0, ah6Var.M);
                }
                ah6Var.i0();
                ah6Var.h0();
                SparseArray sparseArray = ah6Var.a;
                int size = sparseArray.size();
                while (i3 < size) {
                    hec hecVar = (hec) sparseArray.valueAt(i3);
                    if (hecVar != null && (fragmentView = hecVar.a.getFragmentView()) != null) {
                        jdc.b(fragmentView, vxcVar);
                    }
                    i3++;
                }
                return vxc.b;
        }
    }

    @Override
    public final void a(String str) {
        c0c c0cVar = (c0c) this.b;
        c0cVar.Z1 = str;
        c0cVar.e2.O(true);
    }

    @Override
    public final void accept(Object obj) {
        ((jm5) this.b).c((x33) obj);
    }

    @Override
    public final void b() {
        ((jpb) this.b).e();
    }

    @Override
    public final float c(RecyclerView recyclerView) {
        return dha.j(recyclerView);
    }

    @Override
    public final boolean d(int i, View view) {
        ((zsb) this.b).K.d(i, view);
        return true;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) obj).lambda$readParams$0(inputSerializedData, i, z);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) obj).lambda$readParams$0(inputSerializedData, i, z);
                return lambda$readParams$02;
        }
    }

    @Override
    public final void e(qla qlaVar, float f, float f2) {
        j3b j3bVar;
        i3b i3bVar = (i3b) this.b;
        if (!i3bVar.v.y) {
            qlaVar.q = new h3b(i3bVar, (byte) 2);
            float sqrt = (float) Math.sqrt(Math.pow(j3bVar.getHeight(), 2.0d) + Math.pow(j3bVar.getWidth(), 2.0d));
            ArrayList arrayList = i3bVar.i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((qla) obj).j(f, f2, sqrt, false);
            }
        }
    }

    @Override
    public final void g(float f, Canvas canvas, RectF rectF, boolean z) {
        Path path = (Path) this.b;
        if (z) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f, 2.0d);
        path.addCircle((rectF.right + gl.L(7.0f)) - (gl.L(14.0f) * pow), (rectF.bottom + gl.L(7.0f)) - (gl.L(14.0f) * pow), gl.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public final long get() {
        lbc lbcVar = ((d78) this.b).a.G2;
        if (lbcVar != null) {
            return lbcVar.S();
        }
        return 0L;
    }

    @Override
    public final RecyclerView h(View view) {
        ((iva) this.b).getClass();
        return ((gva) view).a;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 10:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                ((fbb) obj3).Z((c4c) obj);
                return;
            default:
                Integer num2 = (Integer) number;
                Float f3 = (Float) serializable;
                Float f4 = (Float) serializable2;
                ((vob) obj3).Z((c4c) obj, (View) obj2);
                return;
        }
    }

    @Override
    public final void k(int i) {
        p8c p8cVar = ((c4c) this.b).D;
        if (p8cVar != null) {
            p8cVar.a(Integer.valueOf(i));
        }
    }

    @Override
    public final Object m() {
        lo9 lo9Var = (lo9) ((z90) this.b).i;
        SQLiteDatabase a = lo9Var.a();
        a.beginTransaction();
        try {
            a.compileStatement("DELETE FROM log_event_dropped").execute();
            a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + lo9Var.b.e()).execute();
            a.setTransactionSuccessful();
            a.endTransaction();
            return null;
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
    }

    @Override
    public final void onFinishVideoRecording(String str, long j) {
        t6b t6bVar = (t6b) this.b;
        t7b t7bVar = t6bVar.a;
        f29 f29Var = t7bVar.P0;
        int i = t7bVar.c;
        if (f29Var != null) {
            f29Var.g(true);
        }
        if (t7bVar.p0()) {
            t7bVar.s.d();
        }
        if (t7bVar.H1 != null && t7bVar.C0 != null) {
            t7bVar.R1 = false;
            t7bVar.S1 = false;
            dv8 dv8Var = t7bVar.D0;
            if (dv8Var != null) {
                dv8Var.f(false);
            }
            if (j <= 800) {
                t7bVar.e(false, true);
                t7bVar.c0(false);
                t7bVar.K0.b(false, true);
                f29 f29Var2 = t7bVar.P0;
                if (f29Var2 != null) {
                    f29Var2.g(true);
                }
                try {
                    t7bVar.H1.delete();
                    t7bVar.H1 = null;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return;
                    }
                }
                return;
            }
            t7bVar.h0(false, true);
            f4b o = f4b.o(t7bVar.H1, str, j);
            o.J0 = t7bVar.w0;
            o.K0 = t7bVar.x0;
            o.A();
            t7bVar.e(false, true);
            t7bVar.c0(false);
            t7bVar.K0.b(false, true);
            f29 f29Var3 = t7bVar.P0;
            if (f29Var3 != null) {
                f29Var3.g(true);
            }
            if (t7bVar.B0.i()) {
                t7bVar.H1 = null;
                o.P = 1.0f;
                if (t7bVar.B0.l(o)) {
                    f4b a = f4b.a(t7bVar.B0.getLayout(), t7bVar.B0.getContent());
                    t7bVar.L1 = a;
                    a6b.a(i, a);
                    t7bVar.M1 = false;
                    int videoWidth = t7bVar.C0.getVideoWidth();
                    int videoHeight = t7bVar.C0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        f4b f4bVar = t7bVar.L1;
                        f4bVar.k0 = videoWidth;
                        f4bVar.l0 = videoHeight;
                        f4bVar.z();
                    }
                }
                t7bVar.l0(true);
                return;
            }
            t7bVar.L1 = o;
            a6b.a(i, o);
            t7bVar.M1 = false;
            int videoWidth2 = t7bVar.C0.getVideoWidth();
            int videoHeight2 = t7bVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                f4b f4bVar2 = t7bVar.L1;
                f4bVar2.k0 = videoWidth2;
                f4bVar2.l0 = videoHeight2;
                f4bVar2.z();
            }
            t7bVar.J(new r6b(t6bVar, (byte) 3), 0L);
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        mza mzaVar = (mza) this.b;
        List list = (List) obj;
        if (list.size() <= 0) {
            fa4.b("objimg: no objects");
            return;
        }
        int i = ((fk5) list.get(0)).c;
        String[] strArr = aqe.a;
        String str = null;
        if (strArr == null) {
            strArr = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
            aqe.a = strArr;
        }
        if (i >= 0 && i < strArr.length) {
            str = strArr[i];
        }
        mzaVar.d0 = str;
        StringBuilder sb = new StringBuilder("objimg: detected #");
        sb.append(((fk5) list.get(0)).c);
        sb.append(" ");
        sb.append(mzaVar.d0);
        sb.append(" ");
        de9.s(((fk5) list.get(0)).a, sb);
        vu3.g(mzaVar.d0);
    }

    @Override
    public final void r(int i) {
        b8c b8cVar = (b8c) this.b;
        if (b8cVar.h == null && !b8cVar.f.e()) {
            b8cVar.w.f.e(false, true);
        }
        b8cVar.f();
    }

    @Override
    public final void s(long j, xu7 xu7Var) {
        sqd.b(j, xu7Var, ((uv9) this.b).c);
    }

    @Override
    public final void t(RecyclerView recyclerView) {
        de9.d(recyclerView);
    }

    @Override
    public final vf6 t1() {
        return null;
    }

    @Override
    public final Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override
    public final void u(hd hdVar, int i) {
        int i2;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 2:
                x0b x0bVar = (x0b) obj;
                x0bVar.e.presentFragment(new StickersActivity(x0bVar.d ? 1 : 0, null));
                hdVar.dismiss();
                return;
            case 3:
                gl.t1((y0b) obj);
                hdVar.dismiss();
                return;
            case 14:
                ThemeActivity themeActivity = ((lkb) obj).a;
                if (gl.O1()) {
                    i2 = 18;
                } else {
                    i2 = 16;
                }
                boolean C0 = themeActivity.C0(i2);
                if (themeActivity.B0(17, true)) {
                    C0 = true;
                }
                if (C0) {
                    themeActivity.a.h(ThemeActivity.c0(themeActivity), new Object());
                    themeActivity.a.h(ThemeActivity.d0(themeActivity), new Object());
                }
                if (themeActivity.c != null) {
                    akb O0 = bkb.O0("Blue");
                    akb B0 = bkb.B0();
                    SparseArray sparseArray = O0.b0;
                    byte b2 = bkb.n;
                    zjb zjbVar = (zjb) sparseArray.get(b2);
                    if (zjbVar != null) {
                        vjb vjbVar = new vjb();
                        vjbVar.c = "d";
                        vjbVar.a = "Blue_99_wp.jpg";
                        vjbVar.b = "Blue_99_wp.jpg";
                        zjbVar.y = vjbVar;
                        O0.v(vjbVar);
                    }
                    if (O0 != B0) {
                        O0.u(b2);
                        bkb.x1(O0, true, false, true, false, false);
                        themeActivity.c.B1(O0, null);
                        themeActivity.c.z0(0);
                        return;
                    } else if (O0.Z != b2) {
                        if (themeActivity.f == 1) {
                            z = true;
                        }
                        bkb.I1(B0, z, b2, null);
                        themeActivity.a.g(themeActivity.r0);
                        return;
                    } else {
                        bkb.s1(true);
                        return;
                    }
                }
                return;
            case 15:
                qmb qmbVar = ((ulb) obj).a;
                akb akbVar = qmbVar.g0;
                bkb.j0(akbVar, qmbVar.w, true);
                bkb.o();
                bkb.r1(false, false);
                kk7.e().k(273, akbVar, Boolean.valueOf(qmbVar.h0), null, -1);
                qmbVar.finishFragment();
                return;
            default:
                ((n3c) obj).a.I0(true);
                return;
        }
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override
    public final void n() {
    }

    private final void l(ImageReceiver imageReceiver) {
    }

    private final void o(ImageReceiver imageReceiver) {
    }

    @Override
    public final void m2(ArrayList arrayList) {
    }

    private final void f(int i, Drawable drawable) {
    }

    private final void i(int i, Drawable drawable) {
    }
}
