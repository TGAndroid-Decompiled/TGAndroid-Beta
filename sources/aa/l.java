package aa;

import android.util.JsonReader;
import android.util.Log;
import da.k0;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.y00;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ms;
public final class l implements Function {
    public final int f822a;

    public l(int i7) {
        this.f822a = i7;
    }

    public Function andThen(Function function) {
        int i7 = this.f822a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        long j3;
        int[] array;
        switch (this.f822a) {
            case 0:
                String name = ((File) obj).getName();
                name.getClass();
                if (!name.equals("trigger-type-anomaly")) {
                    if (!name.equals("trigger-type-oom")) {
                        return 0;
                    }
                    return 7;
                }
                return 8;
            case 1:
                File file = (File) obj;
                try {
                    ea.a aVar = ga.b.f13609g;
                    String f10 = ga.b.f(file);
                    aVar.getClass();
                    try {
                        JsonReader jsonReader = new JsonReader(new StringReader(f10));
                        try {
                            k0 h = ea.a.h(jsonReader);
                            jsonReader.close();
                            return Optional.of(h);
                        } catch (Throwable th2) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (IllegalStateException e10) {
                        throw new IOException(e10);
                    }
                } catch (IOException e11) {
                    Log.w("FirebaseCrashlytics", "Unable to read the Profiling Manager file ", e11);
                    return Optional.empty();
                }
            case 2:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 3:
                String str = (String) obj;
                Pattern pattern = Utilities.f21330a;
                try {
                    j3 = Long.parseLong(str);
                } catch (Exception unused) {
                    j3 = 0;
                }
                return Long.valueOf(j3);
            case 4:
                array = DesugarArrays.stream(((String) obj).split(",")).mapToInt(new bg.d(12)).toArray();
                return array;
            case 5:
                return String.valueOf((Long) obj);
            case 6:
                return qp.a((int[]) obj);
            case 7:
                return ((y00) obj).f26555b;
            case 8:
                return Long.valueOf(m5.o((TLRPC.Peer) obj));
            case 9:
                return Long.valueOf(((ij) obj).Z0());
            case 10:
                return Integer.valueOf(((ij) obj).f1());
            case 11:
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj;
                if (channelParticipant == null) {
                    return null;
                }
                return channelParticipant.banned_rights;
            case 12:
                return Long.valueOf(m5.o(((TLRPC.GroupCallParticipant) obj).peer));
            case 13:
                return Long.valueOf(m5.o(((TLRPC.GroupCallParticipant) obj).peer));
            case 14:
                return ((ms) obj).f47870a;
            default:
                return ((ms) obj).f47870a;
        }
    }

    public Function compose(Function function) {
        int i7 = this.f822a;
        return Function$CC.$default$compose(this, function);
    }
}
