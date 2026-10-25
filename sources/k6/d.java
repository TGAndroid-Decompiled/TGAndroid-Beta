package k6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.cast.y;
import java.util.regex.Matcher;
public final class d extends y {
    public final a f16408a;

    public d(a aVar, Looper looper) {
        super(looper);
        this.f16408a = aVar;
        Looper.getMainLooper();
    }

    @Override
    public final void handleMessage(Message message) {
        String str;
        a aVar = this.f16408a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new f());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof g) {
                        aVar.f16402g = (g) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        aVar.f16401f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (action != "com.google.android.c2dm.intent.REGISTRATION" && (action == null || !action.equals("com.google.android.c2dm.intent.REGISTRATION"))) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && ((str = split[1]) == "ID" || (str != null && str.equals("ID")))) {
                            String str2 = split[2];
                            String str3 = split[3];
                            if (str3.startsWith(":")) {
                                str3 = str3.substring(1);
                            }
                            aVar.d(str2, intent2.putExtra("error", str3).getExtras());
                            return;
                        }
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    synchronized (aVar.f16398a) {
                        int i10 = 0;
                        while (true) {
                            try {
                                a0.l lVar = aVar.f16398a;
                                if (i10 < lVar.f27c) {
                                    aVar.d((String) lVar.e(i10), intent2.getExtras());
                                    i10++;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = a.f16397j.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    aVar.d(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
