package a1;

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
import c2.y0;
import c2.z0;
import c5.j;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b0;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.s;
import d4.n;
import d4.x;
import d4.y;
import dg.g2;
import dg.q0;
import dg.s0;
import eg.h3;
import eg.o3;
import eg.p0;
import eg.p3;
import eg.t2;
import f3.h;
import hg.e1;
import hg.x1;
import j3.n0;
import j7.a7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.j5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ht0;
import org.telegram.ui.oq0;
import org.telegram.ui.yh;
import qh.q6;
import y2.i;
import z3.k;
public final class c implements OnSuccessListener, c9.e, Continuation, OnCompleteListener, x, q0, g3.b, g2, c2, q6, ImageReceiver.ImageReceiverDelegate, xd.b, ba.a {
    public final int f34a;
    public final Object f35b;

    public c(z0 z0Var, y0 y0Var) {
        this.f34a = 2;
        this.f35b = z0Var;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        eh.f.a((eh.f) this.f35b);
    }

    @Override
    public Typeface a() {
        return s0.a((Font) this.f35b);
    }

    @Override
    public int b(Object obj) {
        n0 n0Var = (n0) this.f35b;
        n nVar = (n) obj;
        String str = nVar.f4236b;
        if ((!str.equals(n0Var.C) && !str.equals(y.b(n0Var))) || !nVar.c(n0Var, false)) {
            return 0;
        }
        return 1;
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f35b, options);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ij0 lottieAnimation;
        p3 p3Var = (p3) this.f35b;
        if (z4 && !z10 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            p3Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public void e() {
        float f10;
        ht0 ht0Var = (ht0) this.f35b;
        TextView textView = ht0Var.f5131v1;
        boolean a2 = ht0Var.C0.a();
        ImageView imageView = ht0Var.f5129t1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 0.6f;
        if (a2) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        animate.alpha(f10).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public Object e0(j jVar) {
        return this.f35b;
    }

    @Override
    public void f(ba.b bVar) {
        f9.a aVar = (f9.a) this.f35b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f6224b.set((f9.a) bVar.get());
    }

    @Override
    public Object g() {
        SQLiteDatabase a2;
        int i10 = this.f34a;
        Object obj = this.f35b;
        switch (i10) {
            case 13:
                h hVar = (h) ((f3.c) obj);
                hVar.getClass();
                int i11 = b3.a.f1389e;
                ?? obj2 = new Object();
                obj2.f4081b = null;
                obj2.f4082c = new ArrayList();
                obj2.d = null;
                obj2.f4080a = "";
                HashMap hashMap = new HashMap();
                a2 = hVar.a();
                a2.beginTransaction();
                try {
                    b3.a aVar = (b3.a) h.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new androidx.car.app.utils.a(hVar, hashMap, (Object) obj2, 6));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 14:
                h hVar2 = (h) ((f3.d) obj);
                long W = hVar2.f5983b.W() - hVar2.d.d;
                a2 = hVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(W)};
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
            case 15:
                h hVar3 = (h) ((f3.c) ((e3.g) obj).f4937i);
                a2 = hVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f5983b.W()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                s sVar = (s) obj;
                for (i iVar : (Iterable) ((h) ((f3.d) sVar.f4081b)).c(new k(1))) {
                    ((androidx.biometric.e) sVar.f4082c).A(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f34a) {
            case 18:
                ((oq0) this.f35b).run();
                return;
            case 19:
                ((p0) this.f35b).f5426a.f5105c2.r();
                return;
            case 28:
                ((x1) this.f35b).run();
                return;
            default:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f35b;
                p2 R = LaunchActivity.R();
                if (R != null) {
                    e1.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f34a) {
            case 6:
                b0.b((Intent) this.f35b);
                return;
            case 7:
                ((d0) this.f35b).f4048b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f35b).cancel(false);
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z4;
        switch (this.f34a) {
            case 0:
                ((f) this.f35b).invoke(obj);
                return;
            case 1:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 4:
                com.google.firebase.messaging.y yVar = (com.google.firebase.messaging.y) obj;
                if (((FirebaseMessaging) this.f35b).f4012e.o() && yVar.h.a() != null) {
                    synchronized (yVar) {
                        z4 = yVar.f4107g;
                    }
                    if (!z4) {
                        yVar.h(0L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 12:
                ((e1.b) this.f35b).invoke(obj);
                return;
            case 21:
                t2 t2Var = (t2) this.f35b;
                mb.b bVar = (mb.b) obj;
                t2Var.f5494z0 = true;
                t2Var.f5493y0 = false;
                return;
            case 22:
                h3 h3Var = (h3) this.f35b;
                mb.b bVar2 = (mb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar2.f13621a.size(); i10++) {
                    mb.a aVar = (mb.a) bVar2.f13621a.get(i10);
                    ?? obj2 = new Object();
                    obj2.f5379a = aVar.f13617a;
                    obj2.f5380b = aVar.d;
                    obj2.f5381c = aVar.f13620e;
                    obj2.d = aVar.f13618b;
                    obj2.f5382e = aVar.f13619c;
                    arrayList.add(obj2);
                }
                h3Var.run(arrayList);
                return;
            case 23:
                o3 o3Var = (o3) this.f35b;
                List list = (List) obj;
                o3Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i11 = ((jb.a) list.get(0)).f9991c;
                String str = null;
                if (a7.f9554a == null) {
                    a7.f9554a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i11 >= 0) {
                    String[] strArr = a7.f9554a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                    }
                }
                o3Var.W = str;
                StringBuilder sb = new StringBuilder("objimg: detected #");
                sb.append(((jb.a) list.get(0)).f9991c);
                sb.append(" ");
                sb.append(o3Var.W);
                sb.append(" ");
                yh.v(((jb.a) list.get(0)).f9989a, sb);
                Emoji.getEmojiDrawable(o3Var.W);
                return;
            default:
                ((e1.b) this.f35b).invoke(obj);
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((a9.a) this.f35b).getClass();
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
    public void z(float f10, int i10) {
    }
}
