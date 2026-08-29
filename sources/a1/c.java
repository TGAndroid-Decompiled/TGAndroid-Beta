package a1;

import a4.a0;
import a4.b0;
import a4.q;
import a5.j;
import ag.m2;
import ag.s0;
import ag.u0;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import bg.n3;
import bg.u3;
import bg.v3;
import bg.y2;
import c2.a1;
import c2.b1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.z;
import eg.f1;
import eg.y1;
import f3.h;
import j3.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import nh.m7;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.i5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gq0;
import org.telegram.ui.th;
import org.telegram.ui.ws0;
import y2.i;
public final class c implements OnSuccessListener, a0, a9.e, s0, m2, b2, m7, ImageReceiver.ImageReceiverDelegate, vd.b, Continuation, OnCompleteListener, z9.a, g3.b {
    public final int f34a;
    public final Object f35b;

    public c(b1 b1Var, a1 a1Var) {
        this.f34a = 14;
        this.f35b = b1Var;
    }

    @Override
    public Object I0(j jVar) {
        return this.f35b;
    }

    @Override
    public void N(int i10, float f9, float f10, vd.c cVar) {
        bh.f.a((bh.f) this.f35b);
    }

    @Override
    public Typeface a() {
        return u0.a((Font) this.f35b);
    }

    @Override
    public int b(Object obj) {
        t0 t0Var = (t0) this.f35b;
        q qVar = (q) obj;
        String str = qVar.f105b;
        if ((!str.equals(t0Var.B) && !str.equals(b0.b(t0Var))) || !qVar.c(t0Var, false)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        v3 v3Var = (v3) this.f35b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            v3Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void e() {
        float f9;
        ws0 ws0Var = (ws0) this.f35b;
        TextView textView = ws0Var.f2252u1;
        boolean a2 = ws0Var.B0.a();
        ImageView imageView = ws0Var.f2250s1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f9 = 1.0f;
        } else {
            f9 = 0.6f;
        }
        animate.alpha(f9).translationY(0.0f).setDuration(150L).start();
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
    public Object f() {
        SQLiteDatabase a2;
        int i10 = this.f34a;
        Object obj = this.f35b;
        switch (i10) {
            case 23:
                h hVar = (h) ((f3.c) obj);
                hVar.getClass();
                int i11 = b3.a.f1898e;
                s sVar = new s(3, false);
                sVar.f5186c = null;
                sVar.d = new ArrayList();
                sVar.f5187e = null;
                sVar.f5185b = "";
                HashMap hashMap = new HashMap();
                a2 = hVar.a();
                a2.beginTransaction();
                try {
                    b3.a aVar = (b3.a) h.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new androidx.car.app.utils.a(hVar, hashMap, sVar, 7));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 24:
                h hVar2 = (h) ((f3.d) obj);
                long e10 = hVar2.f6539b.e() - hVar2.d.d;
                a2 = hVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(e10)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i12 = rawQuery.getInt(0);
                        hVar2.e(i12, b3.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 25:
                h hVar3 = (h) ((f3.c) ((e3.f) obj).f5818i);
                a2 = hVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f6539b.e()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                s sVar2 = (s) obj;
                for (i iVar : (Iterable) ((h) ((f3.d) sVar2.f5186c)).c(new eg.c(6))) {
                    ((androidx.biometric.e) sVar2.d).A(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f34a) {
            case 5:
                ((gq0) this.f35b).run();
                return;
            case 6:
                ((bg.s0) this.f35b).f2498a.f2226b2.r();
                return;
            case 27:
                ((y1) this.f35b).run();
                return;
            case 28:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f35b;
                o2 R = LaunchActivity.R();
                if (R != null) {
                    f1.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            default:
                ((eg.t0) this.f35b).run();
                return;
        }
    }

    @Override
    public Bitmap h(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f35b, options);
    }

    @Override
    public void j(z9.b bVar) {
        d9.b bVar2 = (d9.b) this.f35b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        bVar2.f5534b.set((d9.b) bVar.get());
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f34a) {
            case 17:
                c0.b((Intent) this.f35b);
                return;
            case 18:
                ((e0) this.f35b).f5154b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f35b).cancel(false);
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.f34a) {
            case 0:
                ((f) this.f35b).invoke(obj);
                return;
            case 8:
                y2 y2Var = (y2) this.f35b;
                kb.b bVar = (kb.b) obj;
                y2Var.f2628y0 = true;
                y2Var.f2627x0 = false;
                return;
            case 9:
                n3 n3Var = (n3) this.f35b;
                kb.b bVar2 = (kb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar2.f13605a.size(); i10++) {
                    kb.a aVar = (kb.a) bVar2.f13605a.get(i10);
                    ?? obj2 = new Object();
                    obj2.f2533a = aVar.f13601a;
                    obj2.f2534b = aVar.d;
                    obj2.f2535c = aVar.f13604e;
                    obj2.d = aVar.f13602b;
                    obj2.f2536e = aVar.f13603c;
                    arrayList.add(obj2);
                }
                n3Var.run(arrayList);
                return;
            case 10:
                u3 u3Var = (u3) this.f35b;
                List list = (List) obj;
                u3Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i11 = ((hb.a) list.get(0)).f7984c;
                String str = null;
                if (h7.s.f7750a == null) {
                    h7.s.f7750a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i11 >= 0) {
                    String[] strArr = h7.s.f7750a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                    }
                }
                u3Var.V = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((hb.a) list.get(0)).f7984c);
                sb2.append(" ");
                sb2.append(u3Var.V);
                sb2.append(" ");
                th.v(((hb.a) list.get(0)).f7982a, sb2);
                Emoji.getEmojiDrawable(u3Var.V);
                return;
            case 13:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 15:
                z zVar = (z) obj;
                if (((FirebaseMessaging) this.f35b).f5115e.l() && zVar.h.a() != null) {
                    synchronized (zVar) {
                        z10 = zVar.f5213g;
                    }
                    if (!z10) {
                        zVar.h(0L);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((b1.f) this.f35b).invoke(obj);
                return;
            default:
                ((e1.b) this.f35b).invoke(obj);
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((bg.c2) this.f35b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public c(Object obj, int i10) {
        this.f34a = i10;
        this.f35b = obj;
    }

    @Override
    public void z(float f9, int i10) {
    }
}
