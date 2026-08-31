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
import e0.o0;
import f0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f6807a;
    public String f6808b;
    public Intent[] f6809c;
    public ComponentName d;
    public CharSequence f6810e;
    public CharSequence f6811f;
    public CharSequence f6812g;
    public IconCompat h;
    public o0[] f6813i;
    public Set f6814j;
    public h f6815k;
    public boolean f6816l;
    public int f6817m;
    public PersistableBundle f6818n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f6808b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f6809c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f6807a, this.f6808b).setShortLabel(this.f6810e).setIntents(this.f6809c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f6807a));
        }
        if (!TextUtils.isEmpty(this.f6811f)) {
            intents.setLongLabel(this.f6811f);
        }
        if (!TextUtils.isEmpty(this.f6812g)) {
            intents.setDisabledMessage(this.f6812g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f6814j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f6817m);
        PersistableBundle persistableBundle = this.f6818n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            o0[] o0VarArr = this.f6813i;
            if (o0VarArr != null && o0VarArr.length > 0) {
                int length = o0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    o0 o0Var = this.f6813i[i10];
                    o0Var.getClass();
                    personArr[i10] = d1.f.E(o0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.f6815k;
            if (hVar != null) {
                intents.setLocusId(hVar.f5716b);
            }
            intents.setLongLived(this.f6816l);
        } else {
            if (this.f6818n == null) {
                this.f6818n = new PersistableBundle();
            }
            o0[] o0VarArr2 = this.f6813i;
            if (o0VarArr2 != null && o0VarArr2.length > 0) {
                this.f6818n.putInt("extraPersonCount", o0VarArr2.length);
                while (i10 < this.f6813i.length) {
                    PersistableBundle persistableBundle2 = this.f6818n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb.append(i11);
                    String sb2 = sb.toString();
                    o0 o0Var2 = this.f6813i[i10];
                    o0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = o0Var2.f4835a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", o0Var2.f4837c);
                    persistableBundle3.putString("key", o0Var2.d);
                    persistableBundle3.putBoolean("isBot", o0Var2.f4838e);
                    persistableBundle3.putBoolean("isImportant", o0Var2.f4839f);
                    persistableBundle2.putPersistableBundle(sb2, persistableBundle3);
                    i10 = i11;
                }
            }
            h hVar2 = this.f6815k;
            if (hVar2 != null) {
                this.f6818n.putString("extraLocusId", hVar2.f5715a);
            }
            this.f6818n.putBoolean("extraLongLived", this.f6816l);
            intents.setExtras(this.f6818n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.f(intents);
        }
        return intents.build();
    }
}
