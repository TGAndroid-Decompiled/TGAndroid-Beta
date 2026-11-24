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
public final class a32 implements ku4, ee, kac, y73, gka, hka, pac, mr2, v03 {
    public final byte a;

    public a32(byte b) {
        this.a = b;
    }

    public static vk2 c() {
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
                    return new vk2(new PrismaHighlighter(byteArray));
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

    public static void f(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override
    public final Object a(JsonReader jsonReader) {
        switch (this.a) {
            case 28:
                jsonReader.beginObject();
                String str = null;
                String str2 = null;
                String str3 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    char c = 65535;
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 3002454:
                            if (nextName.equals("arch")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 230943785:
                            if (nextName.equals("buildId")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            str2 = jsonReader.nextString();
                            if (str2 != null) {
                                break;
                            } else {
                                gxc.d("Null libraryName");
                                return null;
                            }
                        case 1:
                            str = jsonReader.nextString();
                            if (str != null) {
                                break;
                            } else {
                                gxc.d("Null arch");
                                return null;
                            }
                        case 2:
                            str3 = jsonReader.nextString();
                            if (str3 != null) {
                                break;
                            } else {
                                gxc.d("Null buildId");
                                return null;
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str != null && str2 != null && str3 != null) {
                    return new e90(str, str2, str3);
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
                dq9.m(ts2.n("Missing required properties:", sb));
                return null;
            default:
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
                                gxc.d("Null contents");
                                return null;
                            }
                        }
                    } else {
                        str4 = jsonReader.nextString();
                        if (str4 == null) {
                            gxc.d("Null filename");
                            return null;
                        }
                    }
                }
                jsonReader.endObject();
                if (str4 != null && bArr != null) {
                    return new h90(str4, bArr);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str4 == null) {
                    sb2.append(" filename");
                }
                if (bArr == null) {
                    sb2.append(" contents");
                }
                dq9.m(ts2.n("Missing required properties:", sb2));
                return null;
        }
    }

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override
    public final a83 createDataSource() {
        return new ly(a.b);
    }

    @Override
    public final void d(Object obj, float f) {
        gl2 gl2Var = (gl2) obj;
        switch (this.a) {
            case 12:
                gl2Var.M1 = f;
                if (gl2Var.getParent() != null) {
                    ((View) gl2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 13:
            case 15:
            default:
                gl2Var.P1 = f;
                if (gl2Var.getParent() != null) {
                    ((View) gl2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 14:
                gl2Var.N1 = f;
                if (gl2Var.getParent() != null) {
                    ((View) gl2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 16:
                gl2Var.O1 = f;
                if (gl2Var.getParent() != null) {
                    ((View) gl2Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final List g(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public final float get(Object obj) {
        gl2 gl2Var = (gl2) obj;
        switch (this.a) {
            case 11:
                return gl2Var.M1;
            case 12:
            case 14:
            default:
                return gl2Var.P1;
            case 13:
                return gl2Var.N1;
            case 15:
                return gl2Var.O1;
        }
    }

    @Override
    public final Object j(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        if (num.intValue() == 0) {
            return jb6.H(',', "Stars", num2.intValue());
        }
        return String.valueOf(num2);
    }

    @Override
    public final Object l(Object obj) {
        Void r1 = (Void) obj;
        switch (this.a) {
            case 0:
                ika ikaVar = d32.c0;
                return Boolean.FALSE;
            default:
                return CheckBoxBase.I;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 1:
                heVar.dismiss();
                return;
            case 2:
            default:
                heVar.dismiss();
                return;
            case 3:
                heVar.dismiss();
                return;
        }
    }
}
