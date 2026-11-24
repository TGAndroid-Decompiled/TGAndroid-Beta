package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public abstract class fd {
    public static final LongSparseArray a = new LongSparseArray();
    public static final LongSparseArray b = new LongSparseArray();

    public static TL_aicompose.AiComposeTone a(int i, TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (inputAiComposeTone != null) {
            ArrayList arrayList = oc7.r1(i).P1().b;
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

    public static ed b(int i, long j) {
        String str;
        ed edVar;
        ed edVar2;
        String str2;
        String str3;
        if (j == 0) {
            return null;
        }
        int i2 = 0;
        if (!pg3.B(j)) {
            hs6 d0 = hs6.d0(i);
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
                    String E0 = s1c.E0(s1c.J0(str4, null, null));
                    if (str3 != null) {
                        E0 = kt6.o(str3, " ", E0);
                    }
                    obj.e = E0;
                } else {
                    if (str3 == null) {
                        str3 = jb6.M0(2131754963, null);
                    }
                    obj.e = str3;
                }
                if (obj.b) {
                    obj.e = b10.j(new StringBuilder(), obj.e, " + Emoji");
                }
                return obj;
            }
        }
        LongSparseArray longSparseArray = a;
        long j2 = (j << 3) + i;
        LongSparseArray longSparseArray2 = b;
        if (longSparseArray2.get(j2) != null) {
            edVar2 = (ed) longSparseArray.get(j2);
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
                    edVar = obj2;
                } catch (Throwable unused) {
                }
                longSparseArray.put(j2, edVar);
                longSparseArray2.put(j2, Boolean.TRUE);
                edVar2 = edVar;
            }
            edVar = null;
            longSparseArray.put(j2, edVar);
            longSparseArray2.put(j2, Boolean.TRUE);
            edVar2 = edVar;
        }
        if (edVar2 == null) {
            return null;
        }
        if (!edVar2.a && !pg3.B(j)) {
            return null;
        }
        return edVar2;
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

    public static void e(int i, long j, ed edVar) {
        boolean z;
        ed edVar2;
        boolean z2;
        TL_aicompose.inputAiComposeStyle inputaicomposestyle;
        TL_aicompose.inputAiComposeStyle inputaicomposestyle2;
        String str;
        if (j != 0) {
            boolean z3 = true;
            if (edVar != null && (edVar.a || pg3.B(j))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                edVar2 = edVar;
            } else {
                edVar2 = null;
            }
            LongSparseArray longSparseArray = a;
            LongSparseArray longSparseArray2 = b;
            long j2 = (j << 3) + i;
            if (edVar2 != null || longSparseArray2.get(j2) == null || longSparseArray.get(j2) != null) {
                longSparseArray.put(j2, edVar2);
                longSparseArray2.put(j2, Boolean.TRUE);
                if (edVar2 == null) {
                    a.b.getSharedPreferences("anim_ai_always", 0).edit().remove(c(i, j)).apply();
                } else {
                    SerializedData serializedData = new SerializedData();
                    serializedData.writeInt32(1);
                    serializedData.writeInt32(edVar2.f);
                    serializedData.writeBool(edVar2.a);
                    serializedData.writeBool(edVar2.b);
                    if (edVar2.c != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    serializedData.writeBool(z2);
                    String str2 = edVar2.c;
                    if (str2 != null) {
                        serializedData.writeString(str2);
                    }
                    String str3 = edVar2.e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    serializedData.writeString(str3);
                    TL_aicompose.InputAiComposeTone d = d(edVar2.d);
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
            if (!pg3.B(j)) {
                hs6 d0 = hs6.d0(i);
                if (edVar != null && !z) {
                    inputaicomposestyle = new TL_aicompose.inputAiComposeStyle();
                    inputaicomposestyle.tone = d(edVar.d);
                    if (TextUtils.isEmpty(edVar.c)) {
                        str = null;
                    } else {
                        str = edVar.c;
                    }
                    inputaicomposestyle.to_lang = str;
                    inputaicomposestyle.emojify = edVar.b;
                } else {
                    inputaicomposestyle = null;
                }
                if (!pg3.B(j)) {
                    TLRPC.InputPeer i1 = d0.getMessagesController().i1(j);
                    d0.k();
                    TL_aicompose.inputAiComposeStyle inputaicomposestyle3 = (TL_aicompose.inputAiComposeStyle) d0.r1.f(j);
                    if (hs6.A0(inputaicomposestyle)) {
                        inputaicomposestyle2 = null;
                    } else {
                        inputaicomposestyle2 = inputaicomposestyle;
                    }
                    if (!hs6.j(inputaicomposestyle3, inputaicomposestyle2)) {
                        d0.F1(j, inputaicomposestyle2);
                        TL_aicompose.setChatStyle setchatstyle = new TL_aicompose.setChatStyle();
                        setchatstyle.peer = i1;
                        setchatstyle.style = inputaicomposestyle2;
                        d0.getConnectionsManager().sendRequestTyped(setchatstyle, new kc((byte) 0), new tm3(d0, j, inputaicomposestyle2, inputaicomposestyle3));
                    }
                }
            }
        }
    }
}
