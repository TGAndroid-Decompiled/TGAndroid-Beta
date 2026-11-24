package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import java.nio.charset.Charset;
import java.util.List;
public final class u03 implements v03, z0c, x76 {
    public final byte a;

    public u03(tk tkVar, int i, int i2, boolean z) {
        this.a = (byte) 22;
    }

    @Override
    public final Object a(JsonReader jsonReader) {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.a) {
            case 0:
                ?? obj = new Object();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -1536268810:
                            if (nextName.equals("parameterKey")) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        case -1027290370:
                            if (nextName.equals("templateVersion")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 1098747284:
                            if (nextName.equals("rolloutVariant")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 1124454216:
                            if (nextName.equals("parameterValue")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        default:
                            z = true;
                            break;
                    }
                    switch (z) {
                        case false:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                obj.b = nextString;
                                break;
                            } else {
                                gxc.d("Null parameterKey");
                                return null;
                            }
                        case true:
                            obj.d = jsonReader.nextLong();
                            obj.e = (byte) (obj.e | 1);
                            break;
                        case true:
                            jsonReader.beginObject();
                            String str = null;
                            String str2 = null;
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                nextName2.getClass();
                                if (!nextName2.equals("variantId")) {
                                    if (!nextName2.equals("rolloutId")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str = jsonReader.nextString();
                                        if (str == null) {
                                            gxc.d("Null rolloutId");
                                            return null;
                                        }
                                    }
                                } else {
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        gxc.d("Null variantId");
                                        return null;
                                    }
                                }
                            }
                            jsonReader.endObject();
                            if (str != null && str2 != null) {
                                obj.a = new ha0(str, str2);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                if (str == null) {
                                    sb.append(" rolloutId");
                                }
                                if (str2 == null) {
                                    sb.append(" variantId");
                                }
                                dq9.m(ts2.n("Missing required properties:", sb));
                                return null;
                            }
                        case true:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 != null) {
                                obj.c = nextString2;
                                break;
                            } else {
                                gxc.d("Null parameterValue");
                                return null;
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return obj.a();
            case 1:
                jsonReader.beginObject();
                byte b = 0;
                int i = 0;
                String str3 = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1266514778:
                            if (nextName3.equals("frames")) {
                                z2 = false;
                                break;
                            }
                            z2 = true;
                            break;
                        case 3373707:
                            if (nextName3.equals("name")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case 2125650548:
                            if (nextName3.equals("importance")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        default:
                            z2 = true;
                            break;
                    }
                    switch (z2) {
                        case false:
                            list = w03.b(jsonReader, new u03((byte) 3));
                            if (list != null) {
                                break;
                            } else {
                                gxc.d("Null frames");
                                return null;
                            }
                        case true:
                            str3 = jsonReader.nextString();
                            if (str3 != null) {
                                break;
                            } else {
                                gxc.d("Null name");
                                return null;
                            }
                        case true:
                            i = jsonReader.nextInt();
                            b = (byte) (b | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b == 1 && str3 != null && list != null) {
                    return new y90(str3, i, list);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str3 == null) {
                    sb2.append(" name");
                }
                if ((b & 1) == 0) {
                    sb2.append(" importance");
                }
                if (list == null) {
                    sb2.append(" frames");
                }
                dq9.m(ts2.n("Missing required properties:", sb2));
                return null;
            case 2:
                jsonReader.beginObject();
                byte b2 = 0;
                String str4 = null;
                String str5 = null;
                long j = 0;
                long j2 = 0;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    nextName4.getClass();
                    switch (nextName4.hashCode()) {
                        case 3373707:
                            if (nextName4.equals("name")) {
                                z3 = false;
                                break;
                            }
                            z3 = true;
                            break;
                        case 3530753:
                            if (nextName4.equals("size")) {
                                z3 = true;
                                break;
                            }
                            z3 = true;
                            break;
                        case 3601339:
                            if (nextName4.equals("uuid")) {
                                z3 = true;
                                break;
                            }
                            z3 = true;
                            break;
                        case 1153765347:
                            if (nextName4.equals("baseAddress")) {
                                z3 = true;
                                break;
                            }
                            z3 = true;
                            break;
                        default:
                            z3 = true;
                            break;
                    }
                    switch (z3) {
                        case false:
                            str4 = jsonReader.nextString();
                            if (str4 != null) {
                                break;
                            } else {
                                gxc.d("Null name");
                                return null;
                            }
                        case true:
                            b2 = (byte) (b2 | 2);
                            j2 = jsonReader.nextLong();
                            break;
                        case true:
                            str5 = new String(Base64.decode(jsonReader.nextString(), 2), s03.a);
                            break;
                        case true:
                            b2 = (byte) (b2 | 1);
                            j = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b2 == 3 && str4 != null) {
                    return new v90(str4, str5, j, j2);
                }
                StringBuilder sb3 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb3.append(" baseAddress");
                }
                if ((b2 & 2) == 0) {
                    sb3.append(" size");
                }
                if (str4 == null) {
                    sb3.append(" name");
                }
                dq9.m(ts2.n("Missing required properties:", sb3));
                return null;
            default:
                return w03.f(jsonReader);
        }
    }

    @Override
    public final Object apply(Object obj) {
        i93.b.getClass();
        return w03.a.s((s03) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override
    public final void invoke(Object obj) {
        uk ukVar = (uk) obj;
        switch (this.a) {
            case 10:
                ukVar.getClass();
                return;
            case 11:
                ukVar.getClass();
                return;
            case 12:
                ukVar.getClass();
                return;
            case 13:
                ukVar.getClass();
                return;
            case 14:
                ukVar.getClass();
                return;
            case 15:
                ukVar.getClass();
                return;
            case 16:
                ukVar.getClass();
                return;
            case 17:
                ukVar.getClass();
                return;
            case 18:
                ukVar.getClass();
                return;
            case 19:
                ukVar.getClass();
                return;
            case 20:
                ukVar.getClass();
                return;
            case 21:
                ukVar.getClass();
                return;
            case 22:
                ukVar.getClass();
                return;
            case 23:
                ukVar.getClass();
                return;
            case 24:
                ukVar.getClass();
                return;
            case 25:
                ukVar.getClass();
                return;
            case 26:
                ukVar.getClass();
                return;
            case 27:
                ukVar.getClass();
                return;
            case 28:
                ukVar.getClass();
                return;
            default:
                ukVar.getClass();
                return;
        }
    }

    public u03(tk tkVar, int i, byte b) {
        this.a = b;
    }

    public u03(byte b) {
        this.a = b;
    }

    public u03(tk tkVar, Object obj, byte b) {
        this.a = b;
    }

    public u03(tk tkVar, String str, long j, long j2, byte b) {
        this.a = b;
    }

    public u03(tk tkVar, boolean z) {
        this.a = (byte) 15;
    }

    public u03(tk tkVar, boolean z, int i, byte b) {
        this.a = b;
    }
}
