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
import e0.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f10210a;
    public String f10211b;
    public Intent[] f10212c;
    public ComponentName d;
    public CharSequence f10213e;
    public CharSequence f10214f;
    public CharSequence f10215g;
    public IconCompat h;
    public n0[] f10216i;
    public Set f10217j;
    public f0.f f10218k;
    public boolean f10219l;
    public int f10220m;
    public PersistableBundle f10221n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f10211b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f10212c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f10210a, this.f10211b).setShortLabel(this.f10213e).setIntents(this.f10212c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f10210a));
        }
        if (!TextUtils.isEmpty(this.f10214f)) {
            intents.setLongLabel(this.f10214f);
        }
        if (!TextUtils.isEmpty(this.f10215g)) {
            intents.setDisabledMessage(this.f10215g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f10217j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f10220m);
        PersistableBundle persistableBundle = this.f10221n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            n0[] n0VarArr = this.f10216i;
            if (n0VarArr != null && n0VarArr.length > 0) {
                int length = n0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    n0 n0Var = this.f10216i[i10];
                    n0Var.getClass();
                    personArr[i10] = b5.d.E(n0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            f0.f fVar = this.f10218k;
            if (fVar != null) {
                intents.setLocusId(fVar.f9553b);
            }
            intents.setLongLived(this.f10219l);
        } else {
            if (this.f10221n == null) {
                this.f10221n = new PersistableBundle();
            }
            n0[] n0VarArr2 = this.f10216i;
            if (n0VarArr2 != null && n0VarArr2.length > 0) {
                this.f10221n.putInt("extraPersonCount", n0VarArr2.length);
                while (i10 < this.f10216i.length) {
                    PersistableBundle persistableBundle2 = this.f10221n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    n0 n0Var2 = this.f10216i[i10];
                    n0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = n0Var2.f8454a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", n0Var2.f8456c);
                    persistableBundle3.putString("key", n0Var2.d);
                    persistableBundle3.putBoolean("isBot", n0Var2.f8457e);
                    persistableBundle3.putBoolean("isImportant", n0Var2.f8458f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            f0.f fVar2 = this.f10218k;
            if (fVar2 != null) {
                this.f10221n.putString("extraLocusId", fVar2.f9552a);
            }
            this.f10221n.putBoolean("extraLongLived", this.f10219l);
            intents.setExtras(this.f10221n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.h(intents);
        }
        return intents.build();
    }
}
