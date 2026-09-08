package ji;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import bi.k9;
import com.google.android.gms.tasks.OnSuccessListener;
import di.m8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.ir0;
import org.telegram.ui.zt0;
import org.webrtc.GlGenericDrawer;
import w7.t6;
public final class k5 implements t5, le.d, m4.z, m4.e1, m4.c1, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.k1, a5.b, org.telegram.ui.ActionBar.a2, qg.h0, r2.v, t5.b, qg.s1, m8, OnSuccessListener {
    public final int f14047a;
    public final Object f14048b;

    public k5(Object obj, int i10) {
        this.f14047a = i10;
        this.f14048b = obj;
    }

    @Override
    public Object D(cf.c cVar) {
        switch (this.f14047a) {
            case 7:
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.s(na.d.class), cVar.c(xa.b.class), (Executor) cVar.i((q9.r) this.f14048b));
            default:
                return this.f14048b;
        }
    }

    @Override
    public void E(int i10, float f7, float f10, le.e eVar) {
        ((Switch) this.f14048b).invalidate();
    }

    @Override
    public Typeface a() {
        return qg.j0.a((Font) this.f14048b);
    }

    @Override
    public int b(Object obj) {
        b2.s sVar = (b2.s) this.f14048b;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f44860b;
        if ((!str.equals(sVar.f2397r) && !str.equals(r2.w.b(sVar))) || !oVar.c(sVar, false) || !oVar.d(sVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void c(WebView webView, a5.a aVar, Uri uri, boolean z10, b5.h hVar) {
        String uri2;
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f14048b;
        org.telegram.ui.web.d1 d1Var = z0Var.Q;
        if (webView == z0Var && d1Var != null) {
            if (webView == d1Var.f42062a && aVar.f297b == 0) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String l4 = org.telegram.ui.web.d1.l(uri2);
                if (d1Var.f42088t0 && (TextUtils.isEmpty(d1Var.F0) || !TextUtils.equals(d1Var.F0, l4) || !TextUtils.equals(d1Var.F0, d1Var.getOriginHost()))) {
                    d1Var.h("onBotWebMessage ignored: untrusted origin");
                    return;
                }
                k9 g10 = d1Var.g();
                try {
                    aVar.d(0);
                    String str = (String) aVar.f298c;
                    if (str != null && str.length() <= 1048576) {
                        JSONObject jSONObject = new JSONObject(str);
                        String string = jSONObject.getString("eventType");
                        if (!string.isEmpty() && string.length() <= 128) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.c0(d1Var, webView, g10, string, jSONObject.optString("eventData", null), 2));
                            return;
                        }
                        d1Var.h("onBotWebMessage ignored: invalid event type");
                        return;
                    }
                    d1Var.h("onBotWebMessage ignored: invalid payload length");
                    return;
                } catch (JSONException e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            d1Var.h("onBotWebMessage ignored: invalid source or payload");
        }
    }

    @Override
    public Bitmap d(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f14048b, options);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f14047a) {
            case 9:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f14048b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f14048b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void e(m4.q qVar, int i10) {
        qVar.c(i10, (b2.x0) this.f14048b);
    }

    @Override
    public void f() {
        float f7;
        zt0 zt0Var = (zt0) this.f14048b;
        TextView textView = zt0Var.f45402y1;
        boolean a2 = zt0Var.F0.a();
        ImageView imageView = zt0Var.f45400w1;
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f14047a) {
            case 14:
                ((org.telegram.ui.web.c0) this.f14048b).run();
                return;
            case 24:
                ((ir0) this.f14048b).run();
                return;
            default:
                ((rg.d0) this.f14048b).f45187a.f45376f2.r();
                return;
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.f14047a;
        Object obj = this.f14048b;
        switch (i11) {
            case 4:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                m4.c1 c1Var = (m4.c1) obj;
                i9.u uVar = i9.u.f11951b;
                if (!a0Var.j()) {
                    c1Var.j(a0Var.f15870t, rVar);
                    m4.f1.O0(a0Var, rVar, i10, new m4.p1(0));
                }
                return i9.u.f11951b;
        }
    }

    @Override
    public Object i() {
        SQLiteDatabase a2;
        int i10 = this.f14047a;
        Object obj = this.f14048b;
        switch (i10) {
            case 19:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.f16983e;
                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(7, false);
                sVar.f6419c = null;
                sVar.d = new ArrayList();
                sVar.f6420e = null;
                sVar.f6418b = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new s50(gVar, hashMap, sVar, 8));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 20:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long l4 = gVar2.f45967b.l() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(l4)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i12 = rawQuery.getInt(0);
                        gVar2.e(i12, o5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 21:
                s5.g gVar3 = (s5.g) ((s5.c) ((da.b) obj).f6684i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f45967b.l()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) obj;
                for (l5.i iVar : (Iterable) ((s5.g) ((s5.d) sVar2.f6419c)).c(new r9.i(24))) {
                    ((m2.t) sVar2.d).O(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void j(m4.j1 j1Var, m4.r rVar) {
        ((e2.h) this.f14048b).accept(j1Var);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f14047a;
        Object obj2 = this.f14048b;
        switch (i10) {
            case 27:
                rg.z1 z1Var = (rg.z1) obj2;
                ac.b bVar = (ac.b) obj;
                z1Var.C0 = true;
                z1Var.B0 = false;
                return;
            case 28:
                fi.s4 s4Var = (fi.s4) obj2;
                ac.b bVar2 = (ac.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f407a.size(); i11++) {
                    ac.a aVar = (ac.a) bVar2.f407a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f45360a = aVar.f403a;
                    obj3.f45361b = aVar.d;
                    obj3.f45362c = aVar.f406e;
                    obj3.d = aVar.f404b;
                    obj3.f45363e = aVar.f405c;
                    arrayList.add(obj3);
                }
                s4Var.run(arrayList);
                return;
            default:
                rg.o2 o2Var = (rg.o2) obj2;
                List list = (List) obj;
                o2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i12 = ((xb.a) list.get(0)).f49363c;
                String str = null;
                if (t6.f48323a == null) {
                    t6.f48323a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = t6.f48323a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                o2Var.f45410c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((xb.a) list.get(0)).f49363c);
                sb2.append(" ");
                sb2.append(o2Var.f45410c0);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(((xb.a) list.get(0)).f49361a, sb2);
                Emoji.getEmojiDrawable(o2Var.f45410c0);
                return;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f14048b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            AndroidUtilities.runOnUIThread(new jn0(27, tVar, bitmap));
        }
    }

    public k5(p4.s0 s0Var, p4.r0 r0Var) {
        this.f14047a = 15;
        this.f14048b = s0Var;
    }

    @Override
    public void z(float f7, int i10) {
    }
}
