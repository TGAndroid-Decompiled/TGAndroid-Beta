package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import com.google.firebase.components.ComponentRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.messenger.a;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class k32 implements ed, j8c, js4, m63, eia, fia, o8c, bq2, kz2 {
    public final byte a;

    public k32(byte b) {
        this.a = b;
    }

    public static hj2 c() {
        InputStream open = a.b.getAssets().open("grammars.dat");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    open.close();
                    return new hj2(new PrismaHighlighter(byteArray));
                }
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void e(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override
    public final Object a(JsonReader jsonReader) {
        boolean z;
        char c;
        switch (this.a) {
            case 27:
                jsonReader.beginObject();
                String str = null;
                String str2 = null;
                String str3 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        case 3002454:
                            if (nextName.equals("arch")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 230943785:
                            if (nextName.equals("buildId")) {
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
                            str2 = jsonReader.nextString();
                            if (str2 != null) {
                                break;
                            } else {
                                fvc.f("Null libraryName");
                                return null;
                            }
                        case true:
                            str = jsonReader.nextString();
                            if (str != null) {
                                break;
                            } else {
                                fvc.f("Null arch");
                                return null;
                            }
                        case true:
                            str3 = jsonReader.nextString();
                            if (str3 != null) {
                                break;
                            } else {
                                fvc.f("Null buildId");
                                return null;
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str != null && str2 != null && str3 != null) {
                    return new e80(str, str2, str3);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" arch");
                }
                if (str2 == null) {
                    sb.append(" libraryName");
                }
                if (str3 == null) {
                    sb.append(" buildId");
                }
                sc8.j(ir2.o("Missing required properties:", sb));
                return null;
            case 28:
                jsonReader.beginObject();
                String str4 = null;
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("filename")) {
                        if (!nextName2.equals("contents")) {
                            jsonReader.skipValue();
                        } else {
                            bArr = Base64.decode(jsonReader.nextString(), 2);
                            if (bArr == null) {
                                fvc.f("Null contents");
                                return null;
                            }
                        }
                    } else {
                        str4 = jsonReader.nextString();
                        if (str4 == null) {
                            fvc.f("Null filename");
                            return null;
                        }
                    }
                }
                jsonReader.endObject();
                if (str4 != null && bArr != null) {
                    return new h80(str4, bArr);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str4 == null) {
                    sb2.append(" filename");
                }
                if (bArr == null) {
                    sb2.append(" contents");
                }
                sc8.j(ir2.o("Missing required properties:", sb2));
                return null;
            default:
                ?? obj = new Object();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1536268810:
                            if (nextName3.equals("parameterKey")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1027290370:
                            if (nextName3.equals("templateVersion")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1098747284:
                            if (nextName3.equals("rolloutVariant")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1124454216:
                            if (nextName3.equals("parameterValue")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                obj.b = nextString;
                                break;
                            } else {
                                fvc.f("Null parameterKey");
                                return null;
                            }
                        case 1:
                            obj.d = jsonReader.nextLong();
                            obj.e = (byte) (obj.e | 1);
                            break;
                        case 2:
                            jsonReader.beginObject();
                            String str5 = null;
                            String str6 = null;
                            while (jsonReader.hasNext()) {
                                String nextName4 = jsonReader.nextName();
                                nextName4.getClass();
                                if (!nextName4.equals("variantId")) {
                                    if (!nextName4.equals("rolloutId")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str5 = jsonReader.nextString();
                                        if (str5 == null) {
                                            fvc.f("Null rolloutId");
                                            return null;
                                        }
                                    }
                                } else {
                                    str6 = jsonReader.nextString();
                                    if (str6 == null) {
                                        fvc.f("Null variantId");
                                        return null;
                                    }
                                }
                            }
                            jsonReader.endObject();
                            if (str5 != null && str6 != null) {
                                obj.a = new h90(str5, str6);
                                break;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                if (str5 == null) {
                                    sb3.append(" rolloutId");
                                }
                                if (str6 == null) {
                                    sb3.append(" variantId");
                                }
                                sc8.j(ir2.o("Missing required properties:", sb3));
                                return null;
                            }
                        case 3:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 != null) {
                                obj.c = nextString2;
                                break;
                            } else {
                                fvc.f("Null parameterValue");
                                return null;
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return obj.a();
        }
    }

    @Override
    public final void b(Object obj, float f) {
        sj2 sj2Var = (sj2) obj;
        switch (this.a) {
            case 11:
                sj2Var.M1 = f;
                if (sj2Var.getParent() != null) {
                    ((View) sj2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 12:
            case 14:
            default:
                sj2Var.P1 = f;
                if (sj2Var.getParent() != null) {
                    ((View) sj2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 13:
                sj2Var.N1 = f;
                if (sj2Var.getParent() != null) {
                    ((View) sj2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 15:
                sj2Var.O1 = f;
                if (sj2Var.getParent() != null) {
                    ((View) sj2Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final o63 createDataSource() {
        return new kx(a.b);
    }

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override
    public final List f(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        if (num.intValue() == 0) {
            return k96.H(',', "Stars", num2.intValue());
        }
        return String.valueOf(num2);
    }

    @Override
    public final float get(Object obj) {
        sj2 sj2Var = (sj2) obj;
        switch (this.a) {
            case 10:
                return sj2Var.M1;
            case 11:
            case 13:
            default:
                return sj2Var.P1;
            case 12:
                return sj2Var.N1;
            case 14:
                return sj2Var.O1;
        }
    }

    @Override
    public final Object m(Object obj) {
        Void r1 = (Void) obj;
        return CheckBoxBase.I;
    }

    @Override
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 0:
                hdVar.dismiss();
                return;
            case 1:
            default:
                hdVar.dismiss();
                return;
            case 2:
                hdVar.dismiss();
                return;
        }
    }
}
