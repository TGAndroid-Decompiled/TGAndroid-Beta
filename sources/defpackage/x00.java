package defpackage;

import android.util.JsonReader;
import android.util.Log;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLRPC;
public final class x00 implements Function {
    public final byte a;

    public x00(byte b) {
        this.a = b;
    }

    public final Function andThen(Function function) {
        byte b = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        String lambda$poll$9;
        long j;
        int[] array;
        switch (this.a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                return Long.valueOf(pg3.n((TLRPC.Peer) obj));
            case 2:
                return Long.valueOf(((k47) obj).Z0());
            case 3:
                lambda$poll$9 = ConferenceCall.lambda$poll$9((ConferenceCall.CallParticipant) obj);
                return lambda$poll$9;
            case 4:
                String name = ((File) obj).getName();
                name.getClass();
                if (!name.equals("trigger-type-anomaly")) {
                    if (!name.equals("trigger-type-oom")) {
                        return 0;
                    }
                    return 7;
                }
                return 8;
            case 5:
                File file = (File) obj;
                try {
                    w03 w03Var = y03.g;
                    String f = y03.f(file);
                    w03Var.getClass();
                    try {
                        JsonReader jsonReader = new JsonReader(new StringReader(f));
                        try {
                            i90 h = w03.h(jsonReader);
                            jsonReader.close();
                            return Optional.of(h);
                        } catch (Throwable th) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IllegalStateException e) {
                        throw new IOException(e);
                    }
                } catch (IOException e2) {
                    Log.w("FirebaseCrashlytics", "Unable to read the Profiling Manager file ", e2);
                    return Optional.empty();
                }
            case 6:
                return Integer.valueOf(((k47) obj).e1());
            case 7:
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj;
                if (channelParticipant == null) {
                    return null;
                }
                return channelParticipant.banned_rights;
            case 8:
                return Long.valueOf(pg3.n(((TLRPC.GroupCallParticipant) obj).peer));
            case 9:
                return Long.valueOf(pg3.n(((TLRPC.GroupCallParticipant) obj).peer));
            case 10:
                return ((wy2) obj).a;
            case 11:
                String str = (String) obj;
                Pattern pattern = Utilities.a;
                try {
                    j = Long.parseLong(str);
                } catch (Exception unused) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 12:
                array = DesugarArrays.stream(((String) obj).split(",")).mapToInt(new mn((byte) 8)).toArray();
                return array;
            case 13:
                return String.valueOf((Long) obj);
            case 14:
                return oc7.R2((int[]) obj);
            case 15:
                return ((wy2) obj).a;
            default:
                return ((u2c) obj).b;
        }
    }

    public final Function compose(Function function) {
        byte b = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
