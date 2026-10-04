package k2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Build;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import b2.v0;
import ci.i8;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import ei.s4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m4.a1;
import m4.e1;
import m4.k1;
import m4.x0;
import m4.z0;
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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.dr0;
import org.telegram.ui.vt0;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import pg.v1;
import qg.n2;
import qg.o2;
import qg.x1;
import w7.n6;
public final class v implements le.d, li.j, m4.z, z0, e2.h, x0, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, n1, a2, pg.i0, v1, i8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate {
    public final int f14537a;
    public final Object f14538b;

    public v(Object obj, int i10) {
        this.f14537a = i10;
        this.f14538b = obj;
    }

    @Override
    public Object E(cf.c cVar) {
        switch (this.f14537a) {
            case 9:
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.v(na.d.class), cVar.d(xa.b.class), (Executor) cVar.g((q9.r) this.f14538b));
            default:
                return this.f14538b;
        }
    }

    @Override
    public void V(float f7, int i10) {
        int i11 = this.f14537a;
    }

    @Override
    public Typeface a() {
        return pg.k0.a((Font) this.f14538b);
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        switch (this.f14537a) {
            case 1:
                ((Switch) this.f14538b).invalidate();
                return;
            default:
                qh.c.a((qh.c) this.f14538b);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f14537a) {
            case 5:
                ((e1) obj).f((v0) this.f14538b);
                return;
            default:
                ((e1) obj).n((Surface) this.f14538b);
                return;
        }
    }

    @Override
    public void b(m4.q qVar, int i10) {
        qVar.c(i10, (b2.x0) this.f14538b);
    }

    @Override
    public void c(e1 e1Var, m4.r rVar) {
        ((e2.h) this.f14538b).accept(e1Var);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f14537a) {
            case 11:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f14538b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f14538b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kj0 lottieAnimation;
        o2 o2Var = (o2) this.f14538b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            o2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override
    public Bitmap f(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f14538b, options);
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f14537a) {
            case 16:
                ((org.telegram.ui.web.b0) this.f14538b).run();
                return;
            case 21:
                ((dr0) this.f14538b).run();
                return;
            default:
                ((qg.b0) this.f14538b).f44983a.f45173f2.r();
                return;
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.f14537a;
        Object obj = this.f14538b;
        switch (i11) {
            case 4:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                x0 x0Var = (x0) obj;
                i9.u uVar = i9.u.f12030b;
                if (!a0Var.j()) {
                    x0Var.c(a0Var.f16057t, rVar);
                    a1.O0(a0Var, rVar, i10, new k1(0));
                }
                return i9.u.f12030b;
        }
    }

    @Override
    public void j() {
        float f7;
        vt0 vt0Var = (vt0) this.f14538b;
        TextView textView = vt0Var.f45199y1;
        boolean a2 = vt0Var.F0.a();
        ImageView imageView = vt0Var.f45197w1;
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
    public void k(int i10) {
        boolean z10;
        int i11;
        li.a aVar = (li.a) this.f14538b;
        li.n nVar = aVar.f15605a;
        ah.i iVar = aVar.d;
        li.d dVar = aVar.f15608e;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            if (w7.e0.a(i10, 4) || w7.e0.a(i10, 2)) {
                ni.a e7 = nVar.e();
                ViewGroup viewGroup = aVar.h;
                if (viewGroup != null) {
                    e7.b(viewGroup.getY(), aVar.f15610g.getWidth(), aVar.h.getY() + aVar.h.getHeight());
                }
                if (dVar != null) {
                    ArrayList arrayList = dVar.f15633a;
                    dVar.f15634b = e7.f16914b;
                    while (dVar.f15634b > arrayList.size()) {
                        arrayList.add(new li.b(arrayList.size()));
                    }
                    for (int i12 = 0; i12 < dVar.f15634b; i12++) {
                        li.b bVar = (li.b) arrayList.get(i12);
                        bVar.f15612a.set(e7.c(i12));
                        bVar.b(dVar.f15640j, dVar.f15641k, dVar.f15642l);
                        int i13 = dVar.f15643m;
                        int i14 = dVar.f15644n;
                        int i15 = dVar.f15645o;
                        int i16 = dVar.f15646p;
                        bVar.f15627r = i13;
                        bVar.f15628s = i14;
                        bVar.f15629t = i15;
                        bVar.f15630u = i16;
                    }
                }
                iVar.h(e7);
            }
            if (dVar != null) {
                dVar.f15635c = aVar.f15611i;
                dVar.d = aVar.f15610g;
                int i17 = 1;
                if (nVar.h > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = !z10;
                if (dVar.f15639i != z11) {
                    dVar.f15639i = z11;
                    if (!z10) {
                        i11 = 5;
                    } else {
                        i11 = 1;
                    }
                    dVar.f15640j = i11;
                    if (!z10) {
                        i17 = 10;
                    }
                    dVar.f15641k = i17;
                    dVar.f15642l = Math.max(i11, i17);
                    for (int i18 = 0; i18 < dVar.f15634b; i18++) {
                        ((li.b) dVar.f15633a.get(i18)).b(dVar.f15640j, dVar.f15641k, dVar.f15642l);
                    }
                    dVar.f();
                }
                int i19 = nVar.f15672i;
                int i20 = nVar.f15673j;
                dVar.f15647q = i19;
                dVar.f15648r = i20;
                dVar.f();
                dVar.e();
            }
            iVar.e(aVar.f15611i, aVar.f15610g.getWidth(), aVar.f15610g.getHeight());
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f14537a;
        Object obj2 = this.f14538b;
        switch (i10) {
            case 24:
                x1 x1Var = (x1) obj2;
                ac.b bVar = (ac.b) obj;
                x1Var.C0 = true;
                x1Var.B0 = false;
                return;
            case 25:
                s4 s4Var = (s4) obj2;
                ac.b bVar2 = (ac.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f410a.size(); i11++) {
                    ac.a aVar = (ac.a) bVar2.f410a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f45201a = aVar.f406a;
                    obj3.f45202b = aVar.d;
                    obj3.f45203c = aVar.f409e;
                    obj3.d = aVar.f407b;
                    obj3.f45204e = aVar.f408c;
                    arrayList.add(obj3);
                }
                s4Var.run(arrayList);
                return;
            default:
                n2 n2Var = (n2) obj2;
                List list = (List) obj;
                n2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i12 = ((xb.a) list.get(0)).f49824c;
                String str = null;
                if (n6.f48797a == null) {
                    n6.f48797a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = n6.f48797a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                n2Var.f45222c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((xb.a) list.get(0)).f49824c);
                sb2.append(" ");
                sb2.append(n2Var.f45222c0);
                sb2.append(" ");
                e2.t(((xb.a) list.get(0)).f49822a, sb2);
                Emoji.getEmojiDrawable(n2Var.f45222c0);
                return;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f14538b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            AndroidUtilities.runOnUIThread(new uo0(25, uVar, bitmap));
        }
    }

    public v(s0 s0Var, r0 r0Var) {
        this.f14537a = 17;
        this.f14538b = s0Var;
    }

    private final void d(float f7, int i10) {
    }

    private final void e(float f7, int i10) {
    }
}
