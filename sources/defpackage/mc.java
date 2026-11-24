package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_agent;
public final class mc {
    public static final String[] i = {"fast", "medium", "expert", "ultra"};
    public final int a;
    public long c;
    public TL_agent.settings d;
    public boolean e;
    public long g;
    public final ArrayList b = new ArrayList();
    public int f = -1;
    public int h = -1;

    public mc(int i2) {
        this.a = i2;
        String string = oc7.r1(i2).X3.getString("agentSettings", null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.d = TL_agent.settings.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            serializedData.cleanup();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public static mc c(int i2) {
        return oc7.r1(i2).B0();
    }

    public final void a(TL_agent.settings settingsVar) {
        String str;
        this.d = settingsVar;
        if (settingsVar != null) {
            SerializedData serializedData = new SerializedData(settingsVar.getObjectSize());
            this.d.serializeToStream(serializedData);
            str = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        } else {
            str = null;
        }
        oc7.r1(this.a).X3.edit().putString("agentSettings", str).apply();
        i();
    }

    public final String b() {
        TL_agent.settings settingsVar = this.d;
        if (settingsVar != null && !TextUtils.isEmpty(settingsVar.effort)) {
            return this.d.effort;
        }
        return "medium";
    }

    public final TL_agent.agentProvider d(String str) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 < arrayList.size()) {
                if (TextUtils.equals(((TL_agent.agentProvider) arrayList.get(i2)).id, str)) {
                    return (TL_agent.agentProvider) arrayList.get(i2);
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public final ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String string = oc7.r1(this.a).X3.getString("agentRecentModels_" + str, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(string));
                    int readInt32 = serializedData.readInt32(false);
                    for (int i2 = 0; i2 < readInt32; i2++) {
                        TL_agent.agentModel TLdeserialize = TL_agent.agentModel.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                        if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.id)) {
                            arrayList.add(TLdeserialize);
                        }
                    }
                    serializedData.cleanup();
                    return arrayList;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public final boolean f(long j) {
        return oc7.r1(this.a).l4.r0.f.contains(Long.valueOf(j));
    }

    public final void g() {
        if (this.f < 0) {
            if (!this.b.isEmpty() && System.currentTimeMillis() - this.g < 1800000) {
                return;
            }
            TL_agent.getProviders getproviders = new TL_agent.getProviders();
            getproviders.hash = this.c;
            this.f = ConnectionsManager.getInstance(this.a).sendRequestTyped(getproviders, new kc((byte) 0), new lc(this, (byte) 1));
        }
    }

    public final void h() {
        if (this.h >= 0) {
            return;
        }
        this.h = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_agent.getSettings(), new kc((byte) 0), new lc(this, (byte) 0));
    }

    public final void i() {
        nm7.f(this.a).k(nm7.c4, new Object[0]);
    }
}
