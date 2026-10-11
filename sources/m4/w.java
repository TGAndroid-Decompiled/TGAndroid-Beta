package m4;

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
import ci.j8;
import ci.u5;
import com.google.android.gms.tasks.OnSuccessListener;
import ei.q4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i5;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.au0;
import org.telegram.ui.hr0;
import org.webrtc.GlGenericDrawer;
import pg.u1;
import qg.n2;
import qg.o2;
import qg.x1;
import w7.l6;
public final class w implements a0, b1, e2.h, z0, me.d, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.n1, z1, pg.i0, u1, j8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, r2.w, t5.b {
    public final int f16307a;
    public final Object f16308b;

    public w(Object obj, int i10) {
        this.f16307a = i10;
        this.f16308b = obj;
    }

    @Override
    public void A(float f7, int i10) {
        int i11 = this.f16307a;
    }

    @Override
    public Typeface a() {
        return pg.k0.a((Font) this.f16308b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f16307a) {
            case 2:
                ((g1) obj).f((b2.v0) this.f16308b);
                return;
            default:
                ((g1) obj).n((Surface) this.f16308b);
                return;
        }
    }

    @Override
    public int b(Object obj) {
        b2.s sVar = (b2.s) this.f16308b;
        r2.p pVar = (r2.p) obj;
        String str = pVar.f47021b;
        if ((!str.equals(sVar.f3643r) && !str.equals(r2.x.b(sVar))) || !pVar.c(sVar, false) || !pVar.d(sVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f16308b, options);
    }

    @Override
    public void d(q qVar, int i10) {
        qVar.c(i10, (b2.x0) this.f16308b);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f16307a) {
            case 9:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f16308b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f16308b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        dk0 lottieAnimation;
        o2 o2Var = (o2) this.f16308b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            o2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void e() {
        float f7;
        au0 au0Var = (au0) this.f16308b;
        TextView textView = au0Var.f46525y1;
        boolean a2 = au0Var.F0.a();
        ImageView imageView = au0Var.f46523w1;
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
    public void f(a2 a2Var, int i10) {
        switch (this.f16307a) {
            case 14:
                ((org.telegram.ui.web.a0) this.f16308b).run();
                return;
            case 20:
                ((hr0) this.f16308b).run();
                return;
            default:
                ((qg.b0) this.f16308b).f46311a.f46499f2.s();
                return;
        }
    }

    @Override
    public void g(g1 g1Var, r rVar) {
        ((e2.h) this.f16308b).accept(g1Var);
    }

    @Override
    public Object h(b0 b0Var, r rVar, int i10) {
        int i11 = this.f16307a;
        Object obj = this.f16308b;
        switch (i11) {
            case 1:
                return b0Var.l(rVar, (e9.i0) obj);
            default:
                z0 z0Var = (z0) obj;
                i9.u uVar = i9.u.f12079b;
                if (!b0Var.j()) {
                    z0Var.g(b0Var.f16058t, rVar);
                    c1.N0(b0Var, rVar, i10, new m1(0));
                }
                return i9.u.f12079b;
        }
    }

    @Override
    public Object i() {
        s5.g gVar = (s5.g) ((s5.c) this.f16308b);
        gVar.getClass();
        int i10 = o5.a.f17155e;
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(7, false);
        sVar.f7971c = null;
        sVar.d = new ArrayList();
        sVar.f7972e = null;
        sVar.f7970b = "";
        HashMap hashMap = new HashMap();
        SQLiteDatabase a2 = gVar.a();
        a2.beginTransaction();
        try {
            o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new sz(gVar, hashMap, sVar, 10));
            a2.setTransactionSuccessful();
            return aVar;
        } finally {
            a2.endTransaction();
        }
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        switch (this.f16307a) {
            case 6:
                ((Switch) this.f16308b).invalidate();
                return;
            default:
                qh.c.a((qh.c) this.f16308b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f16307a;
        Object obj2 = this.f16308b;
        switch (i10) {
            case 23:
                x1 x1Var = (x1) obj2;
                ac.b bVar = (ac.b) obj;
                x1Var.C0 = true;
                x1Var.B0 = false;
                return;
            case 24:
                q4 q4Var = (q4) obj2;
                ac.b bVar2 = (ac.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f408a.size(); i11++) {
                    ac.a aVar = (ac.a) bVar2.f408a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f46527a = aVar.f404a;
                    obj3.f46528b = aVar.d;
                    obj3.f46529c = aVar.f407e;
                    obj3.d = aVar.f405b;
                    obj3.f46530e = aVar.f406c;
                    arrayList.add(obj3);
                }
                q4Var.run(arrayList);
                return;
            default:
                n2 n2Var = (n2) obj2;
                List list = (List) obj;
                n2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i12 = ((xb.a) list.get(0)).f51231c;
                String str = null;
                if (l6.f50168a == null) {
                    l6.f50168a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = l6.f50168a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                n2Var.f46548c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((xb.a) list.get(0)).f51231c);
                sb2.append(" ");
                sb2.append(n2Var.f46548c0);
                sb2.append(" ");
                hg.c.t(((xb.a) list.get(0)).f51229a, sb2);
                Emoji.getEmojiDrawable(n2Var.f46548c0);
                return;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.v vVar = (org.telegram.ui.Components.voip.v) this.f16308b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.i(1, vVar, bitmap));
        }
    }

    @Override
    public Object y0(u5 u5Var) {
        switch (this.f16307a) {
            case 7:
                return new na.c((Context) u5Var.a(Context.class), ((k9.h) u5Var.a(k9.h.class)).d(), u5Var.y(na.d.class), u5Var.c(xa.b.class), (Executor) u5Var.g((q9.s) this.f16308b));
            default:
                return this.f16308b;
        }
    }

    public w(p4.s0 s0Var, p4.r0 r0Var) {
        this.f16307a = 15;
        this.f16308b = s0Var;
    }

    private final void j(float f7, int i10) {
    }

    private final void k(float f7, int i10) {
    }
}
