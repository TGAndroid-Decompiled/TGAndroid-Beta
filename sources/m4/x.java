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
import org.telegram.messenger.l5;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.cu0;
import org.telegram.ui.kr0;
import org.webrtc.GlGenericDrawer;
import pg.t1;
import qg.o2;
import qg.p2;
import qg.y1;
import w7.k6;
public final class x implements b0, b1, e2.h, z0, me.d, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.n1, z1, pg.i0, t1, j8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, r2.v, t5.b {
    public final int f15995a;
    public final Object f15996b;

    public x(Object obj, int i10) {
        this.f15995a = i10;
        this.f15996b = obj;
    }

    @Override
    public void C(float f7, int i10) {
        int i11 = this.f15995a;
    }

    @Override
    public Typeface a() {
        return pg.k0.a((Font) this.f15996b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f15995a) {
            case 2:
                ((g1) obj).f((b2.v0) this.f15996b);
                return;
            default:
                ((g1) obj).n((Surface) this.f15996b);
                return;
        }
    }

    @Override
    public int b(Object obj) {
        b2.s sVar = (b2.s) this.f15996b;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f47111b;
        if ((!str.equals(sVar.f3641r) && !str.equals(r2.w.b(sVar))) || !oVar.c(sVar, false) || !oVar.d(sVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f15996b, options);
    }

    @Override
    public void d(q qVar, int i10) {
        qVar.c(i10, (b2.x0) this.f15996b);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f15995a) {
            case 10:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f15996b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f15996b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        fk0 lottieAnimation;
        p2 p2Var = (p2) this.f15996b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            p2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        l5.a(this, i10, str, drawable);
    }

    @Override
    public void e() {
        float f7;
        cu0 cu0Var = (cu0) this.f15996b;
        TextView textView = cu0Var.f46333y1;
        boolean a2 = cu0Var.F0.a();
        ImageView imageView = cu0Var.f46331w1;
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
        switch (this.f15995a) {
            case 15:
                ((org.telegram.ui.web.a0) this.f15996b).run();
                return;
            case 20:
                ((kr0) this.f15996b).run();
                return;
            default:
                ((qg.b0) this.f15996b).f46128a.f46307f2.s();
                return;
        }
    }

    @Override
    public void g(g1 g1Var, r rVar) {
        ((e2.h) this.f15996b).accept(g1Var);
    }

    @Override
    public Object h(c0 c0Var, r rVar, int i10) {
        int i11 = this.f15995a;
        Object obj = this.f15996b;
        switch (i11) {
            case 1:
                return c0Var.l(rVar, (e9.i0) obj);
            default:
                z0 z0Var = (z0) obj;
                i9.u uVar = i9.u.f12078b;
                if (!c0Var.j()) {
                    z0Var.g(c0Var.f15748t, rVar);
                    c1.N0(c0Var, rVar, i10, new m1(0));
                }
                return i9.u.f12078b;
        }
    }

    @Override
    public Object i() {
        s5.g gVar = (s5.g) ((s5.c) this.f15996b);
        gVar.getClass();
        int i10 = o5.a.f16821e;
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(7, false);
        sVar.f7968c = null;
        sVar.d = new ArrayList();
        sVar.f7969e = null;
        sVar.f7967b = "";
        HashMap hashMap = new HashMap();
        SQLiteDatabase a2 = gVar.a();
        a2.beginTransaction();
        try {
            o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new uz(gVar, hashMap, sVar, 10));
            a2.setTransactionSuccessful();
            return aVar;
        } finally {
            a2.endTransaction();
        }
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        switch (this.f15995a) {
            case 6:
                ((Switch) this.f15996b).invalidate();
                return;
            default:
                qh.c.a((qh.c) this.f15996b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        l5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f15995a;
        Object obj2 = this.f15996b;
        switch (i10) {
            case 23:
                y1 y1Var = (y1) obj2;
                ac.b bVar = (ac.b) obj;
                y1Var.C0 = true;
                y1Var.B0 = false;
                return;
            case 24:
                q4 q4Var = (q4) obj2;
                ac.b bVar2 = (ac.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f410a.size(); i11++) {
                    ac.a aVar = (ac.a) bVar2.f410a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f46365a = aVar.f406a;
                    obj3.f46366b = aVar.d;
                    obj3.f46367c = aVar.f409e;
                    obj3.d = aVar.f407b;
                    obj3.f46368e = aVar.f408c;
                    arrayList.add(obj3);
                }
                q4Var.run(arrayList);
                return;
            default:
                o2 o2Var = (o2) obj2;
                List list = (List) obj;
                o2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i12 = ((xb.a) list.get(0)).f51338c;
                String str = null;
                if (k6.f50263a == null) {
                    k6.f50263a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = k6.f50263a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                o2Var.f46415c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((xb.a) list.get(0)).f51338c);
                sb2.append(" ");
                sb2.append(o2Var.f46415c0);
                sb2.append(" ");
                hg.c.v(((xb.a) list.get(0)).f51336a, sb2);
                Emoji.getEmojiDrawable(o2Var.f46415c0);
                return;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f15996b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            AndroidUtilities.runOnUIThread(new sj0(29, uVar, bitmap));
        }
    }

    @Override
    public Object x0(u5 u5Var) {
        switch (this.f15995a) {
            case 7:
                return new na.c((Context) u5Var.a(Context.class), ((k9.h) u5Var.a(k9.h.class)).d(), u5Var.x(na.d.class), u5Var.c(xa.b.class), (Executor) u5Var.g((q9.r) this.f15996b));
            default:
                return this.f15996b;
        }
    }

    public x(p4.u0 u0Var, p4.s0 s0Var) {
        this.f15995a = 16;
        this.f15996b = u0Var;
    }

    private final void j(float f7, int i10) {
    }

    private final void k(float f7, int i10) {
    }
}
