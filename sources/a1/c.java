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
import c2.a1;
import c2.z0;
import c5.j;
import cg.h2;
import cg.r0;
import cg.t0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a0;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.r;
import d4.n;
import d4.x;
import d4.y;
import dg.j3;
import dg.q3;
import dg.r3;
import dg.v2;
import f3.h;
import gg.e1;
import gg.x1;
import j3.n0;
import j7.o5;
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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.mt0;
import org.telegram.ui.tq0;
import ph.r6;
import y2.i;
public final class c implements OnSuccessListener, c9.f, r0, Continuation, OnCompleteListener, x, h2, c2, r6, ImageReceiver.ImageReceiverDelegate, xd.b, g3.b, ba.a {
    public final int f31a;
    public final Object f32b;

    public c(a1 a1Var, z0 z0Var) {
        this.f31a = 2;
        this.f32b = a1Var;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        dh.f.a((dh.f) this.f32b);
    }

    @Override
    public Typeface a() {
        return t0.a((Font) this.f32b);
    }

    @Override
    public int b(Object obj) {
        n0 n0Var = (n0) this.f32b;
        n nVar = (n) obj;
        String str = nVar.f4146b;
        if ((!str.equals(n0Var.C) && !str.equals(y.b(n0Var))) || !nVar.c(n0Var, false)) {
            return 0;
        }
        return 1;
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f32b, options);
    }

    @Override
    public Object d0(j jVar) {
        return this.f32b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        gj0 lottieAnimation;
        r3 r3Var = (r3) this.f32b;
        if (z4 && !z10 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            r3Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public void f(ba.b bVar) {
        f9.a aVar = (f9.a) this.f32b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f6094b.set((f9.a) bVar.get());
    }

    @Override
    public void g() {
        float f10;
        mt0 mt0Var = (mt0) this.f32b;
        TextView textView = mt0Var.f4494v1;
        boolean a2 = mt0Var.C0.a();
        ImageView imageView = mt0Var.f4492t1;
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
    public Object h() {
        SQLiteDatabase a2;
        int i10 = this.f31a;
        Object obj = this.f32b;
        switch (i10) {
            case 22:
                h hVar = (h) ((f3.c) obj);
                hVar.getClass();
                int i11 = b3.a.e;
                ?? obj2 = new Object();
                obj2.f4005b = null;
                obj2.f4006c = new ArrayList();
                obj2.d = null;
                obj2.f4004a = "";
                HashMap hashMap = new HashMap();
                a2 = hVar.a();
                a2.beginTransaction();
                try {
                    b3.a aVar = (b3.a) h.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new androidx.car.app.utils.a(hVar, hashMap, (Object) obj2, 7));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 23:
                h hVar2 = (h) ((f3.d) obj);
                long l10 = hVar2.f5876b.l() - hVar2.d.d;
                a2 = hVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(l10)};
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
            case 24:
                h hVar3 = (h) ((f3.c) ((e3.g) obj).f5106i);
                a2 = hVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f5876b.l()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                r rVar = (r) obj;
                for (i iVar : (Iterable) ((h) ((f3.d) rVar.f4005b)).c(new f0.d(1))) {
                    ((af.d) rVar.f4006c).A(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void l(d2 d2Var, int i10) {
        switch (this.f31a) {
            case 13:
                ((tq0) this.f32b).run();
                return;
            case 14:
                ((dg.r0) this.f32b).f4770a.f4468c2.r();
                return;
            case 28:
                ((x1) this.f32b).run();
                return;
            default:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f32b;
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
        switch (this.f31a) {
            case 7:
                a0.b((Intent) this.f32b);
                return;
            case 8:
                ((c0) this.f32b).f3973b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f32b).cancel(false);
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z4;
        switch (this.f31a) {
            case 0:
                ((f) this.f32b).invoke(obj);
                return;
            case 1:
                ((b1.f) this.f32b).invoke(obj);
                return;
            case 5:
                com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) obj;
                if (((FirebaseMessaging) this.f32b).e.o() && xVar.h.a() != null) {
                    synchronized (xVar) {
                        z4 = xVar.f4028g;
                    }
                    if (!z4) {
                        xVar.h(0L);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((b1.f) this.f32b).invoke(obj);
                return;
            case 16:
                v2 v2Var = (v2) this.f32b;
                mb.b bVar = (mb.b) obj;
                v2Var.f4835z0 = true;
                v2Var.f4834y0 = false;
                return;
            case 17:
                j3 j3Var = (j3) this.f32b;
                mb.b bVar2 = (mb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar2.f13887a.size(); i10++) {
                    mb.a aVar = (mb.a) bVar2.f13887a.get(i10);
                    ?? obj2 = new Object();
                    obj2.f4726a = aVar.f13884a;
                    obj2.f4727b = aVar.d;
                    obj2.f4728c = aVar.e;
                    obj2.d = aVar.f13885b;
                    obj2.e = aVar.f13886c;
                    arrayList.add(obj2);
                }
                j3Var.run(arrayList);
                return;
            case 18:
                q3 q3Var = (q3) this.f32b;
                List list = (List) obj;
                q3Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i11 = ((jb.a) list.get(0)).f9339c;
                String str = null;
                if (o5.f9084a == null) {
                    o5.f9084a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i11 >= 0) {
                    String[] strArr = o5.f9084a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                    }
                }
                q3Var.W = str;
                StringBuilder sb = new StringBuilder("objimg: detected #");
                sb.append(((jb.a) list.get(0)).f9339c);
                sb.append(" ");
                sb.append(q3Var.W);
                sb.append(" ");
                ai.v(((jb.a) list.get(0)).f9337a, sb);
                Emoji.getEmojiDrawable(q3Var.W);
                return;
            case 21:
                ((e1.b) this.f32b).invoke(obj);
                return;
            default:
                ((e1.b) this.f32b).invoke(obj);
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((a9.a) this.f32b).getClass();
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
        this.f31a = i10;
        this.f32b = obj;
    }

    @Override
    public void z(float f10, int i10) {
    }
}
