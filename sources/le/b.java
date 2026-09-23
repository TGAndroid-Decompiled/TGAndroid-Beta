package le;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.view.Surface;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import b2.s;
import b2.v0;
import b2.x0;
import ci.j8;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.t;
import ei.r4;
import i9.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import m4.a1;
import m4.b1;
import m4.f1;
import m4.l1;
import m4.q;
import m4.y0;
import m4.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h5;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.cr0;
import org.telegram.ui.tt0;
import org.telegram.ui.web.a0;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import pg.i0;
import pg.k0;
import pg.t1;
import q9.r;
import qg.d0;
import qg.p2;
import qg.q2;
import r2.v;
import r2.w;
import w7.l6;
public final class b implements e, z, a1, e2.h, y0, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, m1, a2, i0, t1, j8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, v, t5.b {
    public final int f13958a;
    public final Object f13959b;

    public b(Object obj, int i10) {
        this.f13958a = i10;
        this.f13959b = obj;
    }

    @Override
    public void C(float f7, int i10) {
        int i11 = this.f13958a;
    }

    @Override
    public void D(int i10, float f7, float f10, f fVar) {
        switch (this.f13958a) {
            case 0:
                ((Switch) this.f13959b).invalidate();
                return;
            default:
                qh.c.a((qh.c) this.f13959b);
                return;
        }
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f13958a) {
            case 7:
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.w(na.d.class), cVar.c(xa.b.class), (Executor) cVar.i((r) this.f13959b));
            default:
                return this.f13959b;
        }
    }

    @Override
    public Typeface a() {
        return k0.a((Font) this.f13959b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13958a) {
            case 3:
                ((f1) obj).f((v0) this.f13959b);
                return;
            default:
                ((f1) obj).n((Surface) this.f13959b);
                return;
        }
    }

    @Override
    public int b(Object obj) {
        s sVar = (s) this.f13959b;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f41916b;
        if ((!str.equals(sVar.f3301r) && !str.equals(w.b(sVar))) || !oVar.c(sVar, false) || !oVar.d(sVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f13959b, options);
    }

    @Override
    public void d(q qVar, int i10) {
        qVar.c(i10, (x0) this.f13959b);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f13958a) {
            case 10:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f13959b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f13959b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yi0 lottieAnimation;
        q2 q2Var = (q2) this.f13959b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            q2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override
    public void e() {
        float f7;
        tt0 tt0Var = (tt0) this.f13959b;
        TextView textView = tt0Var.f41503y1;
        boolean a2 = tt0Var.F0.a();
        ImageView imageView = tt0Var.f41501w1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        animate.alpha(f7).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f13958a) {
            case 15:
                ((a0) this.f13959b).run();
                return;
            case 20:
                ((cr0) this.f13959b).run();
                return;
            default:
                ((d0) this.f13959b).f41280a.f41477f2.r();
                return;
        }
    }

    @Override
    public void g(f1 f1Var, m4.r rVar) {
        ((e2.h) this.f13959b).accept(f1Var);
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.f13958a;
        Object obj = this.f13959b;
        switch (i11) {
            case 2:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                y0 y0Var = (y0) obj;
                u uVar = u.f11044b;
                if (!a0Var.j()) {
                    y0Var.g(a0Var.f14454t, rVar);
                    b1.O0(a0Var, rVar, i10, new l1(0));
                }
                return u.f11044b;
        }
    }

    @Override
    public Object i() {
        s5.g gVar = (s5.g) ((s5.c) this.f13959b);
        gVar.getClass();
        int i10 = o5.a.e;
        t tVar = new t(7, false);
        tVar.f7336c = null;
        tVar.d = new ArrayList();
        tVar.e = null;
        tVar.f7335b = "";
        HashMap hashMap = new HashMap();
        SQLiteDatabase a2 = gVar.a();
        a2.beginTransaction();
        try {
            o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new t50(gVar, hashMap, tVar, 9));
            a2.setTransactionSuccessful();
            return aVar;
        } finally {
            a2.endTransaction();
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f13958a;
        Object obj2 = this.f13959b;
        switch (i10) {
            case 23:
                qg.a2 a2Var = (qg.a2) obj2;
                ac.b bVar = (ac.b) obj;
                a2Var.C0 = true;
                a2Var.B0 = false;
                return;
            case 24:
                r4 r4Var = (r4) obj2;
                ac.b bVar2 = (ac.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f381a.size(); i11++) {
                    ac.a aVar = (ac.a) bVar2.f381a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f41461a = aVar.f378a;
                    obj3.f41462b = aVar.d;
                    obj3.f41463c = aVar.e;
                    obj3.d = aVar.f379b;
                    obj3.e = aVar.f380c;
                    arrayList.add(obj3);
                }
                r4Var.run(arrayList);
                return;
            default:
                p2 p2Var = (p2) obj2;
                List list = (List) obj;
                p2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i12 = ((xb.a) list.get(0)).f45690c;
                String str = null;
                if (l6.f44695a == null) {
                    l6.f44695a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = l6.f44695a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                p2Var.f41511c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((xb.a) list.get(0)).f45690c);
                sb2.append(" ");
                sb2.append(p2Var.f41511c0);
                sb2.append(" ");
                e2.t(((xb.a) list.get(0)).f45688a, sb2);
                Emoji.getEmojiDrawable(p2Var.f41511c0);
                return;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f13959b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            AndroidUtilities.runOnUIThread(new ar0(21, uVar, bitmap));
        }
    }

    public b(s0 s0Var, r0 r0Var) {
        this.f13958a = 16;
        this.f13959b = s0Var;
    }

    private final void j(float f7, int i10) {
    }

    private final void k(float f7, int i10) {
    }
}
