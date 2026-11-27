package defpackage;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class txc implements Runnable {
    public final byte a;
    public final j84 b;

    public txc(j84 j84Var, byte b) {
        this.a = b;
        this.b = j84Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final j84 j84Var = this.b;
        switch (b) {
            case 0:
                if (!j84Var.c) {
                    j84Var.c = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (wxc wxcVar : ((HashMap) j84Var.d).values()) {
                        if (!TextUtils.isEmpty(wxcVar.b) && currentTimeMillis - wxcVar.a <= 604800000) {
                            arrayList.add(0, wxcVar);
                            if (arrayList.size() >= 100) {
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        ArrayList arrayList2 = arrayList;
                                        j84 j84Var2 = j84Var;
                                        switch (b2) {
                                            case 0:
                                                for (int i = 0; i < arrayList2.size(); i++) {
                                                    wxc wxcVar2 = (wxc) arrayList2.get(i);
                                                    ((HashMap) j84Var2.d).put(wxcVar2.b, wxcVar2);
                                                }
                                                j84Var2.a = true;
                                                j84Var2.b = false;
                                                return;
                                            default:
                                                File file = new File(xb4.z(4), "webmetacache.dat");
                                                if (!file.exists()) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        cc4.g(e, true);
                                                        j84Var2.c = false;
                                                        return;
                                                    }
                                                }
                                                vxc vxcVar = new vxc();
                                                vxcVar.a.addAll(arrayList2);
                                                SerializedData serializedData = new SerializedData(vxcVar.getObjectSize());
                                                vxcVar.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e2) {
                                                    cc4.g(e2, true);
                                                }
                                                hl.c3(new txc(j84Var2, (byte) 2));
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    Utilities.e.c(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            ArrayList arrayList2 = arrayList;
                            j84 j84Var2 = j84Var;
                            switch (b2) {
                                case 0:
                                    for (int i = 0; i < arrayList2.size(); i++) {
                                        wxc wxcVar2 = (wxc) arrayList2.get(i);
                                        ((HashMap) j84Var2.d).put(wxcVar2.b, wxcVar2);
                                    }
                                    j84Var2.a = true;
                                    j84Var2.b = false;
                                    return;
                                default:
                                    File file = new File(xb4.z(4), "webmetacache.dat");
                                    if (!file.exists()) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            cc4.g(e, true);
                                            j84Var2.c = false;
                                            return;
                                        }
                                    }
                                    vxc vxcVar = new vxc();
                                    vxcVar.a.addAll(arrayList2);
                                    SerializedData serializedData = new SerializedData(vxcVar.getObjectSize());
                                    vxcVar.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e2) {
                                        cc4.g(e2, true);
                                    }
                                    hl.c3(new txc(j84Var2, (byte) 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                File file = new File(xb4.z(4), "webmetacache.dat");
                if (!file.exists()) {
                    j84Var.a = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    vxc vxcVar = new vxc();
                    vxcVar.readParams(serializedData, true);
                    arrayList2.addAll(vxcVar.a);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ArrayList arrayList22 = arrayList2;
                        j84 j84Var2 = j84Var;
                        switch (b2) {
                            case 0:
                                for (int i = 0; i < arrayList22.size(); i++) {
                                    wxc wxcVar2 = (wxc) arrayList22.get(i);
                                    ((HashMap) j84Var2.d).put(wxcVar2.b, wxcVar2);
                                }
                                j84Var2.a = true;
                                j84Var2.b = false;
                                return;
                            default:
                                File file2 = new File(xb4.z(4), "webmetacache.dat");
                                if (!file2.exists()) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e2) {
                                        cc4.g(e2, true);
                                        j84Var2.c = false;
                                        return;
                                    }
                                }
                                vxc vxcVar2 = new vxc();
                                vxcVar2.a.addAll(arrayList22);
                                SerializedData serializedData2 = new SerializedData(vxcVar2.getObjectSize());
                                vxcVar2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e22) {
                                    cc4.g(e22, true);
                                }
                                hl.c3(new txc(j84Var2, (byte) 2));
                                return;
                        }
                    }
                });
                return;
            default:
                j84Var.c = false;
                return;
        }
    }
}
