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
    public Context f6963a;
    public String f6964b;
    public Intent[] f6965c;
    public ComponentName d;
    public CharSequence f6966e;
    public CharSequence f6967f;
    public CharSequence f6968g;
    public IconCompat h;
    public p0[] f6969i;
    public Set f6970j;
    public h f6971k;
    public boolean f6972l;
    public int f6973m;
    public PersistableBundle f6974n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f6964b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f6965c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f6963a, this.f6964b).setShortLabel(this.f6966e).setIntents(this.f6965c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f6963a));
        }
        if (!TextUtils.isEmpty(this.f6967f)) {
            intents.setLongLabel(this.f6967f);
        }
        if (!TextUtils.isEmpty(this.f6968g)) {
            intents.setDisabledMessage(this.f6968g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f6970j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f6973m);
        PersistableBundle persistableBundle = this.f6974n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            p0[] p0VarArr = this.f6969i;
            if (p0VarArr != null && p0VarArr.length > 0) {
                int length = p0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    p0 p0Var = this.f6969i[i10];
                    p0Var.getClass();
                    personArr[i10] = d1.f.E(p0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.f6971k;
            if (hVar != null) {
                intents.setLocusId(hVar.f6259b);
            }
            intents.setLongLived(this.f6972l);
        } else {
            if (this.f6974n == null) {
                this.f6974n = new PersistableBundle();
            }
            p0[] p0VarArr2 = this.f6969i;
            if (p0VarArr2 != null && p0VarArr2.length > 0) {
                this.f6974n.putInt("extraPersonCount", p0VarArr2.length);
                while (i10 < this.f6969i.length) {
                    PersistableBundle persistableBundle2 = this.f6974n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    p0 p0Var2 = this.f6969i[i10];
                    p0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = p0Var2.f5719a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", p0Var2.f5721c);
                    persistableBundle3.putString("key", p0Var2.d);
                    persistableBundle3.putBoolean("isBot", p0Var2.f5722e);
                    persistableBundle3.putBoolean("isImportant", p0Var2.f5723f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            h hVar2 = this.f6971k;
            if (hVar2 != null) {
                this.f6974n.putString("extraLocusId", hVar2.f6258a);
            }
            this.f6974n.putBoolean("extraLongLived", this.f6972l);
            intents.setExtras(this.f6974n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.f(intents);
        }
        return intents.build();
    }
}
