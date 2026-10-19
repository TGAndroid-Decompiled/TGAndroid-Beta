package g0;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e0.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f10742a;
    public String f10743b;
    public Intent[] f10744c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f10745f;
    public CharSequence f10746g;
    public IconCompat h;
    public m0[] f10747i;
    public Set f10748j;
    public f0.f f10749k;
    public boolean f10750l;
    public int f10751m;
    public PersistableBundle f10752n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f10743b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f10744c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f10742a, this.f10743b).setShortLabel(this.e).setIntents(this.f10744c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f10742a));
        }
        if (!TextUtils.isEmpty(this.f10745f)) {
            intents.setLongLabel(this.f10745f);
        }
        if (!TextUtils.isEmpty(this.f10746g)) {
            intents.setDisabledMessage(this.f10746g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f10748j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f10751m);
        PersistableBundle persistableBundle = this.f10752n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            m0[] m0VarArr = this.f10747i;
            if (m0VarArr != null && m0VarArr.length > 0) {
                int length = m0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    m0 m0Var = this.f10747i[i10];
                    m0Var.getClass();
                    personArr[i10] = b5.d.E(m0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            f0.f fVar = this.f10749k;
            if (fVar != null) {
                intents.setLocusId(fVar.f10275b);
            }
            intents.setLongLived(this.f10750l);
        } else {
            if (this.f10752n == null) {
                this.f10752n = new PersistableBundle();
            }
            m0[] m0VarArr2 = this.f10747i;
            if (m0VarArr2 != null && m0VarArr2.length > 0) {
                this.f10752n.putInt("extraPersonCount", m0VarArr2.length);
                while (i10 < this.f10747i.length) {
                    PersistableBundle persistableBundle2 = this.f10752n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    m0 m0Var2 = this.f10747i[i10];
                    m0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = m0Var2.f8130a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", m0Var2.f8132c);
                    persistableBundle3.putString("key", m0Var2.d);
                    persistableBundle3.putBoolean("isBot", m0Var2.e);
                    persistableBundle3.putBoolean("isImportant", m0Var2.f8133f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            f0.f fVar2 = this.f10749k;
            if (fVar2 != null) {
                this.f10752n.putString("extraLocusId", fVar2.f10274a);
            }
            this.f10752n.putBoolean("extraLongLived", this.f10750l);
            intents.setExtras(this.f10752n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.h(intents);
        }
        return intents.build();
    }
}
