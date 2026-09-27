package le;

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
import b2.s;
import b2.v0;
import ci.i8;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import ei.r4;
import i9.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m4.a1;
import m4.e1;
import m4.k1;
import m4.q;
import m4.x0;
import m4.z;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.dr0;
import org.telegram.ui.vt0;
import org.telegram.ui.web.a0;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import pg.i0;
import pg.k0;
import pg.v1;
import q9.r;
import qg.b0;
import qg.n2;
import qg.o2;
import qg.x1;
import r2.v;
import r2.w;
import w7.m6;
public final class b implements e, li.h, z, z0, e2.h, x0, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, n1, b2, i0, v1, i8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, v {
    public final int f14198a;
    public final Object f14199b;

    public b(Object obj, int i10) {
        this.f14198a = i10;
        this.f14199b = obj;
    }

    @Override
    public void C(float f7, int i10) {
        int i11 = this.f14198a;
    }

    @Override
    public void D(int i10, float f7, float f10, f fVar) {
        switch (this.f14198a) {
            case 0:
                ((Switch) this.f14199b).invalidate();
                return;
            default:
                qh.c.a((qh.c) this.f14199b);
                return;
        }
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f14198a) {
            case 8:
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.x(na.d.class), cVar.c(xa.b.class), (Executor) cVar.h((r) this.f14199b));
            default:
                return this.f14199b;
        }
    }

    @Override
    public Typeface a() {
        return k0.a((Font) this.f14199b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f14198a) {
            case 4:
                ((e1) obj).f((v0) this.f14199b);
                return;
            default:
                ((e1) obj).n((Surface) this.f14199b);
                return;
        }
    }

    @Override
    public int b(Object obj) {
        s sVar = (s) this.f14199b;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f42294b;
        if ((!str.equals(sVar.f3303r) && !str.equals(w.b(sVar))) || !oVar.c(sVar, false) || !oVar.d(sVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void c(q qVar, int i10) {
        qVar.c(i10, (b2.x0) this.f14199b);
    }

    @Override
    public void d(e1 e1Var, m4.r rVar) {
        ((e2.h) this.f14199b).accept(e1Var);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f14198a) {
            case 10:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f14199b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f14199b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kj0 lottieAnimation;
        o2 o2Var = (o2) this.f14199b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            o2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(c2 c2Var, int i10) {
        switch (this.f14198a) {
            case 15:
                ((a0) this.f14199b).run();
                return;
            case 21:
                ((dr0) this.f14199b).run();
                return;
            default:
                ((b0) this.f14199b).f41625a.f41805f2.r();
                return;
        }
    }

    @Override
    public void g() {
        float f7;
        vt0 vt0Var = (vt0) this.f14199b;
        TextView textView = vt0Var.f41831y1;
        boolean a2 = vt0Var.F0.a();
        ImageView imageView = vt0Var.f41829w1;
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
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.f14198a;
        Object obj = this.f14199b;
        switch (i11) {
            case 3:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                x0 x0Var = (x0) obj;
                u uVar = u.f11047b;
                if (!a0Var.j()) {
                    x0Var.d(a0Var.f14734t, rVar);
                    a1.O0(a0Var, rVar, i10, new k1(0));
                }
                return u.f11047b;
        }
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f14199b, options);
    }

    @Override
    public void j(int i10) {
        int i11;
        li.b bVar = (li.b) this.f14199b;
        li.l lVar = bVar.f14354a;
        li.d dVar = bVar.h;
        ah.i iVar = bVar.f14358g;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            dVar.f14370c = bVar.f14361k;
            dVar.d = bVar.f14359i;
            ni.a e = lVar.e();
            ViewGroup viewGroup = bVar.f14360j;
            if (viewGroup != null) {
                e.b(viewGroup.getY(), bVar.f14359i.getWidth(), bVar.f14360j.getY() + bVar.f14360j.getHeight());
            }
            if (lVar.h > 0) {
                i11 = 1;
            } else {
                i11 = 5;
            }
            int i12 = lVar.f14386i;
            int i13 = lVar.f14387j;
            ArrayList arrayList = dVar.f14368a;
            dVar.f14369b = e.f15502b;
            while (dVar.f14369b > arrayList.size()) {
                arrayList.add(new li.c(arrayList.size()));
            }
            for (int i14 = 0; i14 < dVar.f14369b; i14++) {
                ((li.c) arrayList.get(i14)).a(e.c(i14), i11, i12, i13);
            }
            iVar.h(e);
            dVar.a();
            iVar.e(bVar.f14361k, bVar.f14359i.getWidth(), bVar.f14359i.getHeight());
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f14198a;
        Object obj2 = this.f14199b;
        switch (i10) {
            case 24:
                x1 x1Var = (x1) obj2;
                ac.b bVar = (ac.b) obj;
                x1Var.C0 = true;
                x1Var.B0 = false;
                return;
            case 25:
                r4 r4Var = (r4) obj2;
                ac.b bVar2 = (ac.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f381a.size(); i11++) {
                    ac.a aVar = (ac.a) bVar2.f381a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f41833a = aVar.f378a;
                    obj3.f41834b = aVar.d;
                    obj3.f41835c = aVar.e;
                    obj3.d = aVar.f379b;
                    obj3.e = aVar.f380c;
                    arrayList.add(obj3);
                }
                r4Var.run(arrayList);
                return;
            default:
                n2 n2Var = (n2) obj2;
                List list = (List) obj;
                n2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i12 = ((xb.a) list.get(0)).f46064c;
                String str = null;
                if (m6.f45106a == null) {
                    m6.f45106a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = m6.f45106a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                n2Var.f41852c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((xb.a) list.get(0)).f46064c);
                sb2.append(" ");
                sb2.append(n2Var.f41852c0);
                sb2.append(" ");
                e2.t(((xb.a) list.get(0)).f46062a, sb2);
                Emoji.getEmojiDrawable(n2Var.f41852c0);
                return;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f14199b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            AndroidUtilities.runOnUIThread(new dp0(23, uVar, bitmap));
        }
    }

    public b(s0 s0Var, r0 r0Var) {
        this.f14198a = 16;
        this.f14199b = s0Var;
    }

    private final void e(float f7, int i10) {
    }

    private final void k(float f7, int i10) {
    }
}
