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
import e0.p0;
import f0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f10273a;
    public String f10274b;
    public Intent[] f10275c;
    public ComponentName d;
    public CharSequence f10276e;
    public CharSequence f10277f;
    public CharSequence f10278g;
    public IconCompat h;
    public p0[] f10279i;
    public Set f10280j;
    public h f10281k;
    public boolean f10282l;
    public int f10283m;
    public PersistableBundle f10284n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f10274b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f10275c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f10273a, this.f10274b).setShortLabel(this.f10276e).setIntents(this.f10275c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f10273a));
        }
        if (!TextUtils.isEmpty(this.f10277f)) {
            intents.setLongLabel(this.f10277f);
        }
        if (!TextUtils.isEmpty(this.f10278g)) {
            intents.setDisabledMessage(this.f10278g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f10280j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f10283m);
        PersistableBundle persistableBundle = this.f10284n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            p0[] p0VarArr = this.f10279i;
            if (p0VarArr != null && p0VarArr.length > 0) {
                int length = p0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    p0 p0Var = this.f10279i[i10];
                    p0Var.getClass();
                    personArr[i10] = b5.d.E(p0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.f10281k;
            if (hVar != null) {
                intents.setLocusId(hVar.f9165b);
            }
            intents.setLongLived(this.f10282l);
        } else {
            if (this.f10284n == null) {
                this.f10284n = new PersistableBundle();
            }
            p0[] p0VarArr2 = this.f10279i;
            if (p0VarArr2 != null && p0VarArr2.length > 0) {
                this.f10284n.putInt("extraPersonCount", p0VarArr2.length);
                while (i10 < this.f10279i.length) {
                    PersistableBundle persistableBundle2 = this.f10284n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    p0 p0Var2 = this.f10279i[i10];
                    p0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = p0Var2.f8667a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", p0Var2.f8669c);
                    persistableBundle3.putString("key", p0Var2.d);
                    persistableBundle3.putBoolean("isBot", p0Var2.f8670e);
                    persistableBundle3.putBoolean("isImportant", p0Var2.f8671f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            h hVar2 = this.f10281k;
            if (hVar2 != null) {
                this.f10284n.putString("extraLocusId", hVar2.f9164a);
            }
            this.f10284n.putBoolean("extraLongLived", this.f10282l);
            intents.setExtras(this.f10284n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.h(intents);
        }
        return intents.build();
    }
}
