package k2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import b2.x0;
import ci.m8;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import ei.r4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import m4.d1;
import m4.f1;
import m4.g1;
import m4.k1;
import m4.q1;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.cu0;
import org.telegram.ui.kr0;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import pg.s1;
import qg.a2;
import qg.p2;
import qg.q2;
import w7.l6;
public final class v implements ki.f, le.d, m4.z, f1, d1, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, m1, b2, pg.h0, s1, m8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, r2.v, t5.b {
    public final int f13386a;
    public final Object f13387b;

    public v(Object obj, int i10) {
        this.f13386a = i10;
        this.f13387b = obj;
    }

    @Override
    public void C(float f7, int i10) {
        int i11 = this.f13386a;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        switch (this.f13386a) {
            case 2:
                ((Switch) this.f13387b).invalidate();
                return;
            default:
                qh.c.a((qh.c) this.f13387b);
                return;
        }
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f13386a) {
            case 7:
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.w(na.d.class), cVar.c(xa.b.class), (Executor) cVar.i((q9.r) this.f13387b));
            default:
                return this.f13387b;
        }
    }

    @Override
    public Typeface a() {
        return pg.j0.a((Font) this.f13387b);
    }

    @Override
    public int b(Object obj) {
        b2.s sVar = (b2.s) this.f13387b;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f41986b;
        if ((!str.equals(sVar.f3309r) && !str.equals(r2.w.b(sVar))) || !oVar.c(sVar, false) || !oVar.d(sVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f13387b, options);
    }

    @Override
    public void d(m4.q qVar, int i10) {
        qVar.c(i10, (x0) this.f13387b);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f13386a) {
            case 10:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f13387b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f13387b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yi0 lottieAnimation;
        q2 q2Var = (q2) this.f13387b;
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
        cu0 cu0Var = (cu0) this.f13387b;
        TextView textView = cu0Var.f41573y1;
        boolean a2 = cu0Var.F0.a();
        ImageView imageView = cu0Var.f41571w1;
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
    public void f(c2 c2Var, int i10) {
        switch (this.f13386a) {
            case 15:
                ((org.telegram.ui.web.b0) this.f13387b).run();
                return;
            case 20:
                ((kr0) this.f13387b).run();
                return;
            default:
                ((qg.d0) this.f13387b).f41350a.f41547f2.r();
                return;
        }
    }

    @Override
    public void g(k1 k1Var, m4.r rVar) {
        ((e2.h) this.f13387b).accept(k1Var);
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.f13386a;
        Object obj = this.f13387b;
        switch (i11) {
            case 4:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                d1 d1Var = (d1) obj;
                i9.u uVar = i9.u.f11057b;
                if (!a0Var.j()) {
                    d1Var.g(a0Var.f14476t, rVar);
                    g1.O0(a0Var, rVar, i10, new q1(0));
                }
                return i9.u.f11057b;
        }
    }

    @Override
    public Object i() {
        s5.g gVar = (s5.g) ((s5.c) this.f13387b);
        gVar.getClass();
        int i10 = o5.a.e;
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(7, false);
        tVar.f7353c = null;
        tVar.d = new ArrayList();
        tVar.e = null;
        tVar.f7352b = "";
        HashMap hashMap = new HashMap();
        SQLiteDatabase a2 = gVar.a();
        a2.beginTransaction();
        try {
            o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new s50(gVar, hashMap, tVar, 9));
            a2.setTransactionSuccessful();
            return aVar;
        } finally {
            a2.endTransaction();
        }
    }

    @Override
    public void j(int i10) {
        ki.b bVar = (ki.b) this.f13387b;
        ah.i iVar = bVar.d;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            if (w7.c0.a(i10, 4)) {
                li.a b10 = bVar.f13655a.b();
                ViewGroup viewGroup = bVar.f13658f;
                if (viewGroup != null) {
                    b10.b(viewGroup.getY(), bVar.e.getWidth(), bVar.f13658f.getY() + bVar.f13658f.getHeight());
                }
                iVar.h(b10);
            }
            iVar.e(bVar.f13659g, bVar.e.getWidth(), bVar.e.getHeight());
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f13386a;
        Object obj2 = this.f13387b;
        switch (i10) {
            case 23:
                a2 a2Var = (a2) obj2;
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
                    obj3.f41531a = aVar.f378a;
                    obj3.f41532b = aVar.d;
                    obj3.f41533c = aVar.e;
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
                int i12 = ((xb.a) list.get(0)).f45763c;
                String str = null;
                if (l6.f44768a == null) {
                    l6.f44768a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = l6.f44768a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                p2Var.f41581c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((xb.a) list.get(0)).f45763c);
                sb2.append(" ");
                sb2.append(p2Var.f41581c0);
                sb2.append(" ");
                e2.t(((xb.a) list.get(0)).f45761a, sb2);
                Emoji.getEmojiDrawable(p2Var.f41581c0);
                return;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f13387b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            AndroidUtilities.runOnUIThread(new br0(21, uVar, bitmap));
        }
    }

    public v(s0 s0Var, r0 r0Var) {
        this.f13386a = 16;
        this.f13387b = s0Var;
    }

    private final void k(float f7, int i10) {
    }

    private final void l(float f7, int i10) {
    }
}
