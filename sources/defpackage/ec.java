package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public abstract class ec {
    public static final LongSparseArray a = new LongSparseArray();
    public static final LongSparseArray b = new LongSparseArray();

    public static TL_aicompose.AiComposeTone a(int i, TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (inputAiComposeTone != null) {
            ArrayList arrayList = na7.q1(i).O1().b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneID) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.inputAiComposeToneID) inputAiComposeTone).id == ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id) {
                    return aiComposeTone;
                }
                if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSlug) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) && TextUtils.equals(((TL_aicompose.inputAiComposeToneSlug) inputAiComposeTone).slug, ((TL_aicompose.TL_aiComposeTone) aiComposeTone).slug)) {
                    return aiComposeTone;
                }
                if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneDefault) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeToneDefault) && TextUtils.equals(((TL_aicompose.inputAiComposeToneDefault) inputAiComposeTone).tone, ((TL_aicompose.TL_aiComposeToneDefault) aiComposeTone).tone)) {
                    return aiComposeTone;
                }
            }
            return null;
        }
        return null;
    }

    public static dc b(int i, long j) {
        String str;
        dc dcVar;
        dc dcVar2;
        String str2;
        String str3;
        if (j == 0) {
            return null;
        }
        int i2 = 0;
        if (!cf3.B(j)) {
            hq6 d0 = hq6.d0(i);
            d0.k();
            TL_aicompose.inputAiComposeStyle inputaicomposestyle = (TL_aicompose.inputAiComposeStyle) d0.r1.f(j);
            if (inputaicomposestyle != null) {
                ?? obj = new Object();
                if (TextUtils.isEmpty(inputaicomposestyle.to_lang)) {
                    str2 = null;
                } else {
                    str2 = inputaicomposestyle.to_lang;
                }
                obj.c = str2;
                TL_aicompose.InputAiComposeTone d = d(inputaicomposestyle.tone);
                obj.d = d;
                obj.b = inputaicomposestyle.emojify;
                if (obj.c == null) {
                    i2 = 1;
                }
                obj.f = i2;
                TL_aicompose.AiComposeTone a2 = a(i, d);
                if (a2 != null && !TextUtils.isEmpty(a2.title)) {
                    str3 = a2.title;
                } else {
                    str3 = null;
                }
                String str4 = obj.c;
                if (str4 != null) {
                    String E0 = rzb.E0(rzb.J0(str4, null, null));
                    if (str3 != null) {
                        E0 = tb4.y(str3, " ", E0);
                    }
                    obj.e = E0;
                } else {
                    if (str3 == null) {
                        str3 = k96.M0(2131754963, null);
                    }
                    obj.e = str3;
                }
                if (obj.b) {
                    obj.e = b00.j(new StringBuilder(), obj.e, " + Emoji");
                }
                return obj;
            }
        }
        LongSparseArray longSparseArray = a;
        long j2 = (j << 3) + i;
        LongSparseArray longSparseArray2 = b;
        if (longSparseArray2.get(j2) != null) {
            dcVar2 = (dc) longSparseArray.get(j2);
        } else {
            String string = a.b.getSharedPreferences("anim_ai_always", 0).getString(c(i, j), null);
            if (string != null) {
                try {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 2));
                    ?? obj2 = new Object();
                    serializedData.readInt32(false);
                    obj2.f = serializedData.readInt32(false);
                    obj2.a = serializedData.readBool(false);
                    obj2.b = serializedData.readBool(false);
                    if (serializedData.readBool(false)) {
                        str = serializedData.readString(false);
                    } else {
                        str = null;
                    }
                    obj2.c = str;
                    obj2.e = serializedData.readString(false);
                    if (serializedData.readBool(false)) {
                        obj2.d = TL_aicompose.InputAiComposeTone.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    }
                    serializedData.cleanup();
                    dcVar = obj2;
                } catch (Throwable unused) {
                }
                longSparseArray.put(j2, dcVar);
                longSparseArray2.put(j2, Boolean.TRUE);
                dcVar2 = dcVar;
            }
            dcVar = null;
            longSparseArray.put(j2, dcVar);
            longSparseArray2.put(j2, Boolean.TRUE);
            dcVar2 = dcVar;
        }
        if (dcVar2 == null) {
            return null;
        }
        if (!dcVar2.a && !cf3.B(j)) {
            return null;
        }
        return dcVar2;
    }

    public static String c(int i, long j) {
        return i + "_" + j;
    }

    public static TL_aicompose.InputAiComposeTone d(TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneDefault) && TextUtils.isEmpty(((TL_aicompose.inputAiComposeToneDefault) inputAiComposeTone).tone)) || (inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
            return null;
        }
        return inputAiComposeTone;
    }

    public static void e(int i, long j, dc dcVar) {
        boolean z;
        dc dcVar2;
        boolean z2;
        TL_aicompose.inputAiComposeStyle inputaicomposestyle;
        TL_aicompose.inputAiComposeStyle inputaicomposestyle2;
        String str;
        if (j != 0) {
            boolean z3 = true;
            if (dcVar != null && (dcVar.a || cf3.B(j))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                dcVar2 = dcVar;
            } else {
                dcVar2 = null;
            }
            LongSparseArray longSparseArray = a;
            LongSparseArray longSparseArray2 = b;
            long j2 = (j << 3) + i;
            if (dcVar2 != null || longSparseArray2.get(j2) == null || longSparseArray.get(j2) != null) {
                longSparseArray.put(j2, dcVar2);
                longSparseArray2.put(j2, Boolean.TRUE);
                if (dcVar2 == null) {
                    a.b.getSharedPreferences("anim_ai_always", 0).edit().remove(c(i, j)).apply();
                } else {
                    SerializedData serializedData = new SerializedData();
                    serializedData.writeInt32(1);
                    serializedData.writeInt32(dcVar2.f);
                    serializedData.writeBool(dcVar2.a);
                    serializedData.writeBool(dcVar2.b);
                    if (dcVar2.c != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    serializedData.writeBool(z2);
                    String str2 = dcVar2.c;
                    if (str2 != null) {
                        serializedData.writeString(str2);
                    }
                    String str3 = dcVar2.e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    serializedData.writeString(str3);
                    TL_aicompose.InputAiComposeTone d = d(dcVar2.d);
                    if (d == null) {
                        z3 = false;
                    }
                    serializedData.writeBool(z3);
                    if (d != null) {
                        d.serializeToStream(serializedData);
                    }
                    a.b.getSharedPreferences("anim_ai_always", 0).edit().putString(c(i, j), Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                    serializedData.cleanup();
                }
            }
            if (!cf3.B(j)) {
                hq6 d0 = hq6.d0(i);
                if (dcVar != null && !z) {
                    inputaicomposestyle = new TL_aicompose.inputAiComposeStyle();
                    inputaicomposestyle.tone = d(dcVar.d);
                    if (TextUtils.isEmpty(dcVar.c)) {
                        str = null;
                    } else {
                        str = dcVar.c;
                    }
                    inputaicomposestyle.to_lang = str;
                    inputaicomposestyle.emojify = dcVar.b;
                } else {
                    inputaicomposestyle = null;
                }
                if (!cf3.B(j)) {
                    TLRPC.InputPeer h1 = d0.getMessagesController().h1(j);
                    d0.k();
                    TL_aicompose.inputAiComposeStyle inputaicomposestyle3 = (TL_aicompose.inputAiComposeStyle) d0.r1.f(j);
                    if (hq6.A0(inputaicomposestyle)) {
                        inputaicomposestyle2 = null;
                    } else {
                        inputaicomposestyle2 = inputaicomposestyle;
                    }
                    if (!hq6.j(inputaicomposestyle3, inputaicomposestyle2)) {
                        d0.F1(j, inputaicomposestyle2);
                        TL_aicompose.setChatStyle setchatstyle = new TL_aicompose.setChatStyle();
                        setchatstyle.peer = h1;
                        setchatstyle.style = inputaicomposestyle2;
                        d0.getConnectionsManager().sendRequestTyped(setchatstyle, new hc((byte) 0), new il3(d0, j, inputaicomposestyle2, inputaicomposestyle3));
                    }
                }
            }
        }
    }
}
