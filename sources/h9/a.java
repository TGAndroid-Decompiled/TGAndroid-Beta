package h9;

import android.graphics.Insets;
import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d5.k;
import g9.e2;
import g9.o0;
import g9.r0;
import g9.x0;
import h3.f1;
import ha.g0;
import ha.m;
import ha.m0;
import ha.q0;
import ha.t;
import ja.h;
import java.util.List;
import y8.d;
public final class a implements b, d, k {
    public final int f10256a;

    public a(int i9) {
        this.f10256a = i9;
    }

    public static int b(Insets insets) {
        return insets.left;
    }

    public static int c(Insets insets) {
        return insets.top;
    }

    public static int d(Insets insets) {
        return insets.right;
    }

    public static int e(Insets insets) {
        return insets.bottom;
    }

    @Override
    public Object H1(b3.b bVar) {
        m m11getComponents$lambda0;
        m0 m12getComponents$lambda1;
        g0 m13getComponents$lambda2;
        h m14getComponents$lambda3;
        t m15getComponents$lambda4;
        q0 m16getComponents$lambda5;
        switch (this.f10256a) {
            case 5:
                m11getComponents$lambda0 = FirebaseSessionsRegistrar.m11getComponents$lambda0(bVar);
                return m11getComponents$lambda0;
            case 6:
                m12getComponents$lambda1 = FirebaseSessionsRegistrar.m12getComponents$lambda1(bVar);
                return m12getComponents$lambda1;
            case 7:
                m13getComponents$lambda2 = FirebaseSessionsRegistrar.m13getComponents$lambda2(bVar);
                return m13getComponents$lambda2;
            case 8:
                m14getComponents$lambda3 = FirebaseSessionsRegistrar.m14getComponents$lambda3(bVar);
                return m14getComponents$lambda3;
            case 9:
                m15getComponents$lambda4 = FirebaseSessionsRegistrar.m15getComponents$lambda4(bVar);
                return m15getComponents$lambda4;
            default:
                m16getComponents$lambda5 = FirebaseSessionsRegistrar.m16getComponents$lambda5(bVar);
                return m16getComponents$lambda5;
        }
    }

    @Override
    public Object a(JsonReader jsonReader) {
        char c10;
        String str;
        char c11;
        char c12;
        String str2 = " name";
        String str3 = "";
        String str4 = null;
        Long l10 = null;
        switch (this.f10256a) {
            case 0:
                com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(9, false);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -1536268810:
                            if (nextName.equals("parameterKey")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1027290370:
                            if (nextName.equals("templateVersion")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1098747284:
                            if (nextName.equals("rolloutVariant")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1124454216:
                            if (nextName.equals("parameterValue")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                tVar.f4177b = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterKey");
                            }
                        case 1:
                            tVar.f4179e = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            jsonReader.beginObject();
                            String str5 = null;
                            String str6 = null;
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                nextName2.getClass();
                                if (!nextName2.equals("variantId")) {
                                    if (!nextName2.equals("rolloutId")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str5 = jsonReader.nextString();
                                        if (str5 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    }
                                } else {
                                    str6 = jsonReader.nextString();
                                    if (str6 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                }
                            }
                            jsonReader.endObject();
                            if (str5 != null) {
                                str = "";
                            } else {
                                str = " rolloutId";
                            }
                            if (str6 == null) {
                                str = str.concat(" variantId");
                            }
                            if (str.isEmpty()) {
                                tVar.f4178c = new x0(str5, str6);
                                break;
                            } else {
                                throw new IllegalStateException("Missing required properties:".concat(str));
                            }
                        case 3:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 != null) {
                                tVar.d = nextString2;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterValue");
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return tVar.l();
            case 1:
                jsonReader.beginObject();
                Integer num = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1266514778:
                            if (nextName3.equals("frames")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3373707:
                            if (nextName3.equals("name")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2125650548:
                            if (nextName3.equals("importance")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            list = c.d(jsonReader, new a(3));
                            if (list != null) {
                                continue;
                            } else {
                                throw new NullPointerException("Null frames");
                            }
                        case 1:
                            str4 = jsonReader.nextString();
                            if (str4 == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case 2:
                            num = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str4 != null) {
                    str2 = "";
                }
                if (num == null) {
                    str2 = str2.concat(" importance");
                }
                if (list == null) {
                    str2 = ta.b.j(str2, " frames");
                }
                if (str2.isEmpty()) {
                    return new r0(str4, num.intValue(), list);
                }
                throw new IllegalStateException("Missing required properties:".concat(str2));
            case 2:
                jsonReader.beginObject();
                Long l11 = null;
                String str7 = null;
                String str8 = null;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    nextName4.getClass();
                    switch (nextName4.hashCode()) {
                        case 3373707:
                            if (nextName4.equals("name")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3530753:
                            if (nextName4.equals("size")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3601339:
                            if (nextName4.equals("uuid")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1153765347:
                            if (nextName4.equals("baseAddress")) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 != null) {
                                str7 = nextString3;
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case 1:
                            l11 = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            str8 = new String(Base64.decode(jsonReader.nextString(), 2), e2.f7511a);
                            break;
                        case 3:
                            l10 = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (l10 == null) {
                    str3 = " baseAddress";
                }
                if (l11 == null) {
                    str3 = str3.concat(" size");
                }
                if (str7 == null) {
                    str3 = ta.b.j(str3, " name");
                }
                if (str3.isEmpty()) {
                    return new o0(str7, l10.longValue(), l11.longValue(), str8);
                }
                throw new IllegalStateException("Missing required properties:".concat(str3));
            default:
                return c.a(jsonReader);
        }
    }

    @Override
    public void invoke(Object obj) {
        i3.b bVar = (i3.b) obj;
        switch (this.f10256a) {
            case 15:
                bVar.getClass();
                return;
            case 16:
                bVar.getClass();
                return;
            case 17:
                bVar.getClass();
                return;
            case 18:
                bVar.getClass();
                return;
            case 19:
                bVar.getClass();
                return;
            case 20:
                bVar.getClass();
                return;
            case 21:
                bVar.getClass();
                return;
            case 22:
                bVar.getClass();
                return;
            case 23:
                bVar.getClass();
                return;
            case 24:
                bVar.getClass();
                return;
            case 25:
                bVar.getClass();
                return;
            case 26:
                bVar.getClass();
                return;
            case 27:
                bVar.getClass();
                return;
            case 28:
                bVar.getClass();
                return;
            default:
                bVar.getClass();
                return;
        }
    }

    public a(i3.a aVar, int i9, int i10) {
        this.f10256a = 25;
    }

    public a(i3.a aVar, f1 f1Var, int i9) {
        this.f10256a = 26;
    }

    public a(i3.a aVar, Object obj, int i9) {
        this.f10256a = i9;
    }

    public a(i3.a aVar, Object obj, Object obj2, int i9) {
        this.f10256a = i9;
    }

    public a(i3.a aVar, boolean z10) {
        this.f10256a = 17;
    }

    public a(i3.a aVar, boolean z10, int i9, int i10) {
        this.f10256a = i10;
    }
}
